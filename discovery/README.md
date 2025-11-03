# Discovery Search Widgets

Custom HTML/JavaScript widgets for **OCLC WorldShare Discovery** search integration.  
These widgets are designed for ACA member libraries to copy and paste directly into their local systems.

---

## 📋 About These Widgets

All widgets in this directory are based on **OCLC Service Configuration Search Box Generator** output with key modifications to improve functionality and user experience.

### Standard Modifications

All Discovery widgets include the following enhancements:

1. **Class Structure**: Converted from Object to Class structure to support **multiple widgets per webpage**
2. **Preserved Branding**: Retains library-specific branding, colors, tab selections, and icon preferences from OCLC configuration
3. **AI-Assisted Editing**: JavaScript modifications made with AI assistance for reliability and best practices

### Optional Modifications

Depending on library requirements, widgets may also include:

- **Forced OCLC Authentication**: Wraps search to force OCLC sign-in, setting an SSO session cookie for seamless OpenAthens authentication on eResource links
- **Custom Database Lists**: Includes remote databases that are dropped in OCLC-generated code
- **Icon Additions**: Custom icons or visual enhancements

---

## 📁 File Naming Convention

**Format:** `[library-symbol]-[number]-[variant].html`

- **Library Symbol**: OCLC institution symbol (e.g., `wvb`, `abc`)
- **Number**: Sequential version number (`01`, `02`, `03`)
- **Variant**: Brief descriptor of modifications

### Variant Types

- `standard` - Base widget with class structure (may include forced auth )
- `custom-dblist` - Modified database list
- `no-auth` - No forced authentication
- `icons` - Search tab displays favicons
- Combined descriptors as needed (e.g., `custom-dblist-icons`)

### Examples

- `abc-01-standard.html` - ABC base widget with forced authentication
- `wvb-02-custom-dblist-icons.html` - WVB widget with custom database list and icons
- `abc-01-no-auth.html` - ABC widget without forced authentication

---

## 🚀 Usage

1. Browse widgets to find the version that matches your library's needs
2. Copy the HTML code
3. Paste into your library's website where the search box should appear
4. Test to ensure proper functionality

**Note:** These widgets require an active OCLC WorldShare Discovery subscription and proper institution configuration.

---

## 🔧 Current Widgets

### WVB (Bethany College)

- **wvb-01-custom-dblist.html**  
  Base widget with class structure and forced OCLC authentication for SSO support and remote DBs added to database list

- **wvb-02-custom-dblist.html**  
  Copy of wvb-01* with favicon enhancements

---

## 🧩 Requesting Custom Widgets

ACA member libraries can request custom Discovery widgets by contacting the ACA IT team.  
Please provide:
- Your OCLC institution symbol
- Current OCLC Search Box Generator HTML (from Service Configuration)
- Specific requirements (multiple widgets, forced auth, custom databases, etc.)

---

## 📝 Notes

- Widgets are shared "as-is" for ACA member library use
- Test thoroughly in your environment before deploying to production
- Contact ACA IT if you encounter issues or need modifications
