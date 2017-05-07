# Memo


Post sample data with cURL.
```
curl -X POST localhost:8080/api/books -d "{\"title\": \"The art of project management\", \"author\": \"Scott Berkun\", \"publisher\": \"O'REILLY\", \"publishDate\": \"2006-9-5\"}" -H "Content-Type:application/json"
```