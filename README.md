# WMS Snippets

A shared collection of small, reusable code examples and templates for working with **OCLC WorldShare Management Services (WMS)** data, APIs, and integrations.  
These snippets are intended for quick reference and adaptation by Appalachian College Association (ACA) member libraries and IT staff.

---

## 📚 Purpose

This repository provides examples for:

- Formatting and preparing **patron data files** for OCLC SFTP upload  
- Automating **circulation** tasks and related workflows  
- Demonstrating quick fixes or prototypes that don’t require a full repository

Each snippet is meant to be *standalone and lightweight*, with inline comments explaining key steps.

---

## 🗂️ Repository Structure

wms-snippets/
├── circulation/
│ ├── calculateExpiry.java
│ ├── calculate-expiry.py
│ └── README.md


Currently, this repository focuses on **WorldShare Circulation** examples, including patron data preparation, expiration date formatting, and small automation tasks.  
Additional folders (e.g., for API and metadata snippets) may be added in the future.

---

## 💻 Example: Patron Expiration Date Snippet

**Files:**
- `oclc-expiration-date-python.py`  
- `CalculateExpiry.java`  

**Description:**  
Calculates a patron expiration date equal to **December 31 of the current year + 5 years**, formatted as  
`YYYY-MM-DDThh:mm:ss` for inclusion in OCLC Circulation patron load files.

Example output:
2030-12-31T00:00:00


---

## 🧩 Contributing

1. Add new snippets in the most relevant subfolder (or create a new one if needed).  
2. Include a **brief docstring or header comment** describing the snippet’s purpose and usage.  
3. Use clear filenames (e.g., `calculateExpiry.java`, `calculate-expiry.py`).  
4. Submit a **pull request** for review before merging to main.

Contributions from ACA member libraries and staff are welcome!

---

## 🧾 License

Unless otherwise noted, all snippets in this repository are released under the  
[MIT License](https://opensource.org/licenses/MIT), allowing reuse and adaptation with attribution.
