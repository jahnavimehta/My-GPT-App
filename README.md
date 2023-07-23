# My-GPT-App

# My GPT


## Table of Contents

- [Project Description](#project-description)
- [Features](#features)
- [Screenshots](#screenshots)
- [Technology Stack](#technology-stack)
- [Installation](#installation)
- [Development Setup](#development-setup)
- [Contributing](#contributing)
- [Contact](#contact)

## Project Description

My GPT App is an Android application that leverages the power of the OpenAI GPT-3 language model to provide users with 
natural language processing capabilities. The app allows users to enter questions or prompts, and it will generate responses 
based on the GPT-3 model's understanding of the input. It can be used for a wide range of tasks, including generating text, answering questions, 
completing sentences, and more.

## Features

- **Android Studio:** The app is developed using Android Studio, the official Integrated Development Environment (IDE) for Android app development. 
  
- **Kotlin:** The programming language used for developing the app is Kotlin, which is the modern and recommended language for Android app development.

- **OkHttp:** OkHttp is used for making HTTP requests to the OpenAI API, enabling communication with the GPT-3 language model. [https://square.github.io/okhttp/]

- **JSON Parsing:**The app uses JSON parsing to extract the generated text from the response received from the OpenAI API. [https://openai.com/product]

## Screenshots
<p>Some screenshots of the app for a preview of the user interface and functionalities.</p>
<p align="center">
  <img src="https://github.com/jahnavimehta/My-GPT-App/assets/97538596/6b2cbb5e-cc2a-4a9d-b774-87f2bc944d51.png" alt="Screenshot 1" width="400"/>
  <img src="https://github.com/jahnavimehta/My-GPT-App/assets/97538596/5e39fc01-604c-4b27-8a31-db79fa0b091b.png" alt="Screenshot 2" width="400"/>
</p>

## Technology Stack:

-**Programming Language:** Kotlin (for Android app development)

-**API Integration:** The app integrates with the OpenAI API to access the GPT-3.5 language model for natural language processing tasks.

-**Architecture:** The app follows the Model-View-ViewModel (MVVM) architecture, which separates the user interface (View) from the business logic (ViewModel) and the data (Model).MVVM is a popular architecture pattern in Android development as it promotes clean code, testability, and maintainability.

-**Network Communication:** The app uses the OkHttp library to make HTTP requests to the OpenAI API.
OkHttp is a widely used HTTP client for Android that offers a simple and efficient way to send network requests and handle responses.

-**Asynchronous Operations:** The app performs network requests asynchronously using OkHttp's enqueue() method, which ensures that the UI remains responsive while waiting for the API response.

-**JSON Parsing:** The app uses the built-in JSON library in Kotlin to parse the JSON response received from the OpenAI API.
The JSON data is extracted and processed to retrieve the relevant information needed to display the response to the user.

-**Permissions:** The app requests and handles the necessary permissions to access the internet (android.permission.INTERNET) and check network connectivity (android.permission.ACCESS_NETWORK_STATE).

-**SharedPreferences:** To determine whether it's the first launch of the app, the app utilizes SharedPreferences to store and retrieve a boolean flag named isFirstLaunch.
SharedPreferences is used for lightweight data storage to store key-value pairs persistently.

-**Image Display:** The app displays images in the UI using the ImageView widget, which allows the user to see the "My GPT" robot image and other images included in the project.

-**App Navigation:** The app uses explicit intent-based navigation to switch between activities. When the app is launched, it checks if it's the first launch and navigates accordingly to either the MainActivity or WelcomeActivity.

-**UI Customization:** The app customizes the UI by setting background images for the activities and adjusting the font size and color of text elements to improve user experience.




## Installation

1. Clone the repository:


$ git clone [https://github.com/jahnavimehta/My-GPT-App]
$ cd Medpanion
Open the project in your preferred Android development environment (e.g., Android Studio).
Build and run the application on an emulator or physical device.



## Development Setup
- Install Android Studio and set up your development environment.

- Open the project in Android Studio.

- Make sure you have the necessary SDKs and dependencies installed.



## Contributing
We welcome contributions to enhance the app and make it more effective. If you want to contribute to the project, follow these steps:

- Fork the repository.

- Create a new branch.

- Make your changes and commit them.

- Push the changes to your forked repository.

- Open a pull request.

- Please ensure that your contributions align with the project's guidelines and coding standards.


## Contact
If you have any questions or suggestions regarding the My GPT App, feel free to contact us:

Email: jahnaviim@gmail.com
Thank you for using the My GPT App!
