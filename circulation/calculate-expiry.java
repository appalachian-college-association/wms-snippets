from datetime import date, datetime

# Get today's date
today = date.today()

# Calculate December 31 of (current year + 5)
expiration_year = today.year + 5
expiration_date = date(expiration_year, 12, 31)

# Format as YYYY-MM-DDThh:mm:ss
formatted_expiration = expiration_date.strftime("%Y-%m-%dT00:00:00")

print(formatted_expiration)