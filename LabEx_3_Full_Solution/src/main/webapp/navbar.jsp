<header>
  <img src="assets/images/thumbs/no-image.png" alt="Zelora Logo" id="logo">
  <h1>Zelora</h1>

  <select id="languageDropdown">
    <option value="en">English</option>
    <option value="es">Spanish</option>
    <option value="fr">French</option>
    <!-- Add more languages as needed -->
  </select>

  <!-- Button to trigger translation -->
  <button onclick="translateContent()">Translate</button>

</header>

<nav>
  <a href="index.jsp">Home</a>
  <a href="Store.jsp">Store</a>
  <a href="Login.jsp">Login</a>
  <a href="ShowAllCustomers.jsp">Customers</a>
  <a href="ShowAllInventory.jsp">Inventory</a>
</nav>

<script>
  var selectedLanguage = localStorage.getItem('selectedLanguage') || 'en';
  document.getElementById('languageDropdown').value = selectedLanguage;

  translateContent();

  function translateContent() {
    var originalContent = document.getElementById('contentToTranslate').innerHTML;
    var languageCode = document.getElementById('languageDropdown').value;

    // Replace 'YOUR_GOOGLE_API_KEY' with the actual API key
    var apiKey = 'AIzaSyAIMBPnIvytEUZfGf8sLL_hN_-MLojrc50';
    var apiUrl = 'https://translation.googleapis.com/language/translate/v2?key=' + apiKey +
            '&source=en&target=' + languageCode + '&q=' + encodeURIComponent(originalContent);

    fetch(apiUrl, { method: 'POST' })
            .then(response => response.json())
            .then(data => {
              var translatedText = data.data.translations[0].translatedText;
              document.getElementById('contentToTranslate').innerHTML = translatedText;

              // Save the selected language to local storage
              localStorage.setItem('selectedLanguage', languageCode);
            })
            .catch(error => console.error('Error:', error));
  }
</script>
