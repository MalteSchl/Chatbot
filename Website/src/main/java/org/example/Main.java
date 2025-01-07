<!DOCTYPE html>
<html lang="de">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Watson Chatbot - Duales Studium bei Accenture</title>
    <link rel="stylesheet" href="style.css" />
</head>
<body>
    <header>
        <div class="container">
<h1>Willkommen zu meinem Watson Chatbot</h1>
<p>Stelle uns Fragen über den Chat unten rechts!</p>
        </div>
    </header>

    <main>
        <div class="content">
<h2>Wie kann ich dir helfen?</h2>
<p>Unser Chatbot steht dir zur Verfügung, um Antworten auf deine Fragen zu geben.</p>
        </div>

        <section class="about">
<h2>Was ist ein duales Studium bei Accenture?</h2>
<p>Ein duales Studium bei Accenture bietet dir eine einmalige Gelegenheit, Theorie und Praxis zu verbinden und gleichzeitig in der digitalen Transformation zu arbeiten. Accenture ist ein weltweit führendes Unternehmen im Bereich Technologie- und Managementberatung, und als Teil des Teams erhältst du wertvolle Einblicke in spannende Projekte und innovative Lösungen.</p>

<h3>Was erwartet dich während des dualen Studiums?</h3>
<p>Im dualen Studium bei Accenture arbeitest du in verschiedenen Unternehmensbereichen und erwirbst praxisnahe Erfahrungen. Du wirst in hochmodernen Projekten arbeiten, bei denen du dein Wissen direkt in der Praxis anwenden kannst. Dein Studium kombiniert klassische Ausbildung mit echten, beruflichen Herausforderungen.</p>

<h3>Vorteile des dualen Studiums bei Accenture</h3>
            <ul>
                <li><strong>Praxisorientierte Ausbildung:</strong> Du sammelst praktische Erfahrungen, die du im Unternehmen direkt anwenden kannst.</li>
                <li><strong>Fachliche Weiterbildung:</strong> Du hast die Möglichkeit, dich kontinuierlich fortzubilden und neue Fähigkeiten zu entwickeln.</li>
                <li><strong>Netzwerkaufbau:</strong> Als Student bei Accenture baust du ein wertvolles berufliches Netzwerk auf und erhältst Zugang zu den Besten der Branche.</li>
                <li><strong>Karrieremöglichkeiten:</strong> Ein duales Studium bei Accenture ist der perfekte Einstieg in eine Karriere im Bereich Technologie, Management oder Beratung.</li>
            </ul>

<h3>Wie bewirbst du dich?</h3>
<p>Die Bewerbung für ein duales Studium bei Accenture erfolgt über die Karriereseite von Accenture. Achte darauf, alle erforderlichen Unterlagen bereitzustellen und deine Motivation klar und präzise zu formulieren.</p>
        </section>
    </main>

    <!-- Watson Assistant Integration -->
    <script>
window.watsonAssistantChatOptions = {
integrationID: "b372f29e-f654-4c3b-a9a7-9f3c36e17c57", // The ID of this integration.
region: "eu-de", // The region your integration is hosted in.
serviceInstanceID: "c9d751bf-9d19-495d-a9ff-fdd0b678f05b", // The ID of your service instance.
onLoad: async (instance) => { await instance.render(); }
        };
setTimeout(function(){
            const t = document.createElement('script');
    t.src = "https://web-chat.global.assistant.watson.appdomain.cloud/versions/" +
            (window.watsonAssistantChatOptions.clientVersion || 'latest') +
            "/WatsonAssistantChatEntry.js";
    document.head.appendChild(t);
});
    </script>
</body>
</html>
