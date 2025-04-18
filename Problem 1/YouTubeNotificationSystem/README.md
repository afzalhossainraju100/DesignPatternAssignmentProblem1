# YouTube Notification System

This project implements a notification system for YouTube video uploads and live streams using the Observer design pattern. It allows users to subscribe to a YouTube channel and receive notifications when new videos are uploaded.

## Project Structure

```
YouTubeNotificationSystem
├── src
│   ├── Observer.java        # Defines the Observer interface for notifications
│   ├── MobileClient.java    # Implements the Observer interface for mobile notifications
│   ├── WebClient.java       # Implements the Observer interface for web notifications
│   ├── YouTubeChannel.java  # Manages subscribers and video uploads
│   └── Main.java            # Demonstrates the functionality of the notification system
├── .gitignore               # Specifies files and directories to ignore in version control
└── README.md                # Documentation for the project
```

## Getting Started

To set up and run the notification system, follow these steps:

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd YouTubeNotificationSystem
   ```

2. **Compile the Java files**:
   Navigate to the `src` directory and compile the Java files:
   ```
   cd src
   javac *.java
   ```

3. **Run the Main class**:
   Execute the main class to see the notification system in action:
   ```
   java Main
   ```

## Usage

- The `YouTubeChannel` class allows you to subscribe `MobileClient` and `WebClient` instances to receive notifications.
- When a new video is uploaded using the `uploadVideo` method, all subscribed clients will receive a notification in their respective formats.

## Contributing

Feel free to submit issues or pull requests if you have suggestions or improvements for the project.