# Git

### 1. **What is version control?**
   - Version control is a system that records changes to files over time so that you can recall specific versions later. It allows multiple people to collaborate on the same project, keeps a history of revisions, and helps manage code changes.

### 2. **List the git commands you know and what they do**
   - `git init`: Initializes a new Git repository.
   - `git clone <url>`: Clones a repository from a remote server to your local machine.
   - `git status`: Shows the working directory status and staged changes.
   - `git add <file>`: Stages changes for the next commit.
   - `git commit -m "message"`: Saves staged changes with a descriptive message.
   - `git push`: Sends committed changes to a remote repository.
   - `git pull`: Retrieves changes from a remote repository and integrates them into your current branch.
   - `git checkout <branch>`: Switches between branches.
   - `git branch`: Lists all branches or creates a new branch with `-b <branch-name>`.
   - `git merge <branch>`: Merges changes from one branch into another.
   - `git rebase`: Re-applies commits on top of another base commit.
   - `git reset --hard <commit>`: Resets the current branch to a specific commit, discarding changes.
   - `git log`: Displays the commit history.
   - `git stash`: Temporarily saves changes in the working directory without committing them.

### 3. **How would you prevent a file from being tracked by git?**
   - Add the file's name or pattern to the `.gitignore` file, which tells Git to ignore certain files and directories.

   Example:  
   Add `.env` to your `.gitignore` file to prevent tracking environment files.

### 4. **What is a branch? What are some common branching strategies?**
   - A branch is an independent line of development in Git. It allows you to work on different features or fixes without affecting the main codebase. 
   
   Common branching strategies:
   - **Feature Branching**: Creating a new branch for each feature or bug fix.
   - **Git Flow**: A workflow that involves using feature branches, a `develop` branch for integration, and a `master/main` branch for releases.
   - **Trunk-Based Development**: All developers work on a single branch (usually `main` or `master`), with short-lived feature branches.

### 5. **How to create a new branch?**
   - You can create and switch to a new branch using:
     ```bash
     git checkout -b <branch-name>
     ```

### 6. **What is a merge conflict? How do you prevent these and resolve if it happens?**
   - A merge conflict occurs when Git cannot automatically resolve differences between branches during a merge. It usually happens when two or more people edit the same line in a file or make conflicting changes.

   **Prevention**:
   - Frequently pull updates from the main branch to keep your branch up to date.
   - Communicate with team members about changes to avoid conflicts in the same code areas.

   **Resolution**:
   - Git will mark the conflict in the file, and you must manually choose which changes to keep.
   - After resolving conflicts, stage the file and complete the merge with:
     ```bash
     git add <file>
     git commit
     ```

### 7. **What is a GitHub pull request?**
   - A pull request (PR) is a request to merge code from one branch (often a feature branch) into another (usually `main` or `develop`). It's commonly used for code review and collaboration in a shared repository.

### 8. **What is the git workflow for editing code and saving changes?**
   - **Step 1**: Create or switch to a new branch with `git checkout -b <branch-name>`.
   - **Step 2**: Make changes to your files.
   - **Step 3**: Stage the changes using `git add <file>`.
   - **Step 4**: Commit the changes with `git commit -m "message"`.
   - **Step 5**: Push the changes to the remote repository with `git push origin <branch-name>`.

### 9. **What is a commit?**
   - A commit is a snapshot of your staged changes in Git. It acts as a checkpoint that you can return to if needed. Commits include a message that describes the changes made.

### 10. **How would you go back in your commit history if you make a mistake?**
   - You can use the following commands:
     - `git reset --hard <commit>`: Resets your current branch to a specific commit, discarding all changes after it.
     - `git revert <commit>`: Creates a new commit that undoes the changes introduced by a previous commit, keeping the history intact.
     - `git checkout <commit>`: Temporarily checks out an older commit without altering your branch history.

# AWS

### Cloud / AWS Overview

**1. How would you describe AWS? What is "the cloud" or "cloud computing" and why is it so popular now?**
   - **AWS** (Amazon Web Services) is a comprehensive cloud computing platform provided by Amazon. It offers a wide range of cloud services, including computing power, storage, databases, networking, and machine learning, enabling businesses to scale and innovate.
   - **Cloud computing** refers to delivering computing services over the internet ("the cloud") instead of using local servers or personal devices. Cloud computing is popular because it allows businesses to pay only for the resources they use, scale their infrastructure as needed, and reduce the complexity and cost of managing physical hardware.

**2. Define Infrastructure, Platform, and Software as a Service**
   - **Infrastructure as a Service (IaaS)**: Provides virtualized computing resources over the internet. Users rent compute power, storage, and networking, such as EC2, and S3. They manage the OS and applications themselves.
   - **Platform as a Service (PaaS)**: Provides a platform allowing users to build, test, and deploy applications without managing the underlying infrastructure. Examples include AWS Elastic Beanstalk and Google App Engine.
   - **Software as a Service (SaaS)**: Provides fully managed software applications hosted in the cloud that users access over the internet. Examples include Gmail and Dropbox.

**3. What's the difference between a Region and an Availability Zone (AZ)?**
   - A **Region** is a geographic area with multiple isolated locations known as **Availability Zones** (AZs). A region typically contains multiple AZs to provide redundancy and failover support.
   - An **Availability Zone (AZ)** is a distinct data center within a region with its own power, networking, and connectivity. AZs allow for high availability by distributing resources across multiple zones.

**4. How are you charged for using AWS services? Does it vary by service?**
   - AWS uses a **pay-as-you-go** pricing model, meaning you only pay for the resources you use. Charges vary by service and depend on factors such as the amount of storage, compute power, data transfer, and the specific services used (e.g., EC2, S3, Lambda).

**5. Different ways to interact with AWS services?**
   - **AWS Management Console**: A web-based interface for managing AWS services.
   - **AWS CLI (Command Line Interface)**: Allows you to interact with AWS services using command-line commands.
   - **AWS SDKs**: Provide language-specific APIs for interacting with AWS services programmatically (e.g., Python SDK – boto3).
   - **AWS CloudFormation**: Automates the provisioning of AWS resources through templates.


### EC2

**1. What are the configuration options for EC2?**
   - **Instance Type** (compute power and memory)
   - **Operating System** (Linux, Windows, etc.)
   - **Storage** (EBS volumes or instance store)
   - **Security Groups** (firewall settings)
   - **Networking** (VPC, subnets, IP addresses)
   - **IAM Roles** (permissions)

**2. What are the different EC2 instance sizes/types?**
   - EC2 instance types are classified by family, including:
     - **General purpose (e.g., t3, m5)**
     - **Compute optimized (e.g., c5)**
     - **Memory optimized (e.g., r5)**
     - **Storage optimized (e.g., i3)**
     - **GPU instances for AI/ML (e.g., p3)**
     - Instances are further divided by size, such as small, medium, large, xlarge, etc.

**3. Once you create an EC2, how to connect to it?**
   - You connect to a Linux EC2 instance using SSH:
     ```bash
     ssh -i <your-key-file>.pem ec2-user@<public-ip>
     ```
   - For Windows instances, you typically connect using Remote Desktop Protocol (RDP).

**4. What are Security Groups? When defining a rule for a security group, what 3 things do you need to specify?**
   - Security Groups act as virtual firewalls for your instances to control inbound and outbound traffic.
   - When defining a rule, you need to specify:
     - **Protocol** (e.g., TCP, UDP, ICMP)
     - **Port range** (e.g., 22 for SSH, 80 for HTTP)
     - **Source/Destination IP address** (e.g., 0.0.0.0/0 for all IP addresses)

**5. What's the difference between scalability, elasticity, and resiliency?**
   - **Scalability**: The ability to increase resource capacity to meet demand.
   - **Elasticity**: The ability to automatically adjust resources based on demand.
   - **Resiliency**: The ability to recover from failures and ensure continuity of service.

**6. What is autoscaling?**
   - **Autoscaling** automatically adjusts the number of EC2 instances in response to traffic changes. It helps maintain performance and reduce costs by scaling the resources up or down as needed.

**7. Ways of paying for EC2?**
   - **On-Demand**: Pay by the hour or second with no long-term commitment.
   - **Reserved Instances**: Commit to a one or three-year term for lower prices.
   - **Spot Instances**: Bid for unused EC2 capacity at a discount.


### RDS

**1. What's an RDS?**
   - **RDS (Relational Database Service)** is a managed database service that makes it easy to set up, operate, and scale a relational database in the cloud.

**2. Which vendors are supported?**
   - AWS RDS supports multiple database engines, including:
     - **MySQL**
     - **PostgreSQL**
     - **MariaDB**
     - **Oracle**
     - **SQL Server**
     - **Amazon Aurora**


### S3

**1. What kind of data would you store on S3 vs a database?**
   - **S3**: Best for unstructured data such as backups, media files (images, videos), log files, and static website hosting.
   - **Database**: Best for structured data requiring querying, such as transactional data, user information, or application data.

**2. Are there any limits on S3?**
   - S3 has virtually unlimited storage, but there are limits on object size (up to 5TB per object) and bucket limits (100 buckets per account by default, but this can be increased).

**3. What are the rules for bucket naming?**
   - Bucket names must be globally unique.
   - Bucket names must be between 3 and 63 characters long.
   - Bucket names can only contain lowercase letters, numbers, and hyphens.

**4. What are the different storage tiers?**
   - **S3 Standard**: General-purpose storage for frequently accessed data.
   - **S3 Intelligent-Tiering**: Automatically moves data to the most cost-effective storage tier based on usage.
   - **S3 Standard-IA (Infrequent Access)**: Lower-cost storage for data that is accessed less frequently.
   - **S3 Glacier**: Low-cost storage for archival data.

**5. Can you use S3 to host a front-end or back-end of an application?**
   - Yes, you can host static websites (HTML, CSS, JS) on S3. For dynamic back-end services, you'd need additional services like AWS Lambda, API Gateway, or an EC2 instance.


# Docker

### 1. **What is a container? How is it different from a VM?**
   - A **container** is a lightweight, standalone, executable package that includes everything needed to run a piece of software, such as the code, runtime, libraries, and settings.
   - **Difference from a VM**: Containers share the host OS's kernel and run in isolated processes, making them much more lightweight than virtual machines (VMs), which include their own OS and virtual hardware, leading to more resource usage.

### 2. **What is the Docker Daemon?**
   - The **Docker Daemon** is a background service running on the host that manages Docker objects like images, containers, networks, and volumes. It listens for Docker API requests and manages Docker containers.

### 3. **What is a Docker image? Container?**
   - A **Docker image** is a snapshot of a file system and application that you want to run. It includes all dependencies and libraries needed to run an application.
   - A **Docker container** is a running instance of a Docker image. It runs the application inside an isolated environment, using the configuration from the image.

### 4. **How is a Docker image different from a Docker container?**
   - A **Docker image** is the blueprint or template for creating containers. It is a static file that describes the environment for the application.
   - A **Docker container** is the runtime instance of an image. It's an active process running an application, based on the configuration provided by the image.

### 5. **List the steps to start Docker, create a Docker image, and spin up a container**
   1. **Write a Dockerfile**: The Dockerfile contains the instructions for creating a Docker image (such as base image, dependencies, and commands).
   2. **Build the image**: Run `docker build <pathToDockerfile>` to create the Docker image from the Dockerfile.
   3. **Spin up the container**: Use `docker run <imageName>` to create and start a container from the image.

### 6. **What is the relevance of the Dockerfile to this process? List some keywords in the Dockerfile.**
   - The **Dockerfile** is a text file that defines how to build a Docker image. It specifies the base image, application code, environment variables, and instructions to set up the environment.
   
   **Keywords** in a Dockerfile:
   - `FROM`: Specifies the base image to use (e.g., `FROM node:14`).
   - `COPY`: Copies files from the host system into the container.
   - `RUN`: Executes commands inside the container while building the image (e.g., `RUN apt-get update`).
   - `CMD`: Specifies the command to run when a container starts (e.g., `CMD ["node", "app.js"]`).
   - `EXPOSE`: Informs Docker that the container will listen on the specified port(s).
   - `WORKDIR`: Sets the working directory inside the container.

### 7. **What are some other Docker commands?**
   - `docker ps`: Lists running containers.
   - `docker stop <container>`: Stops a running container.
   - `docker rm <container>`: Removes a stopped container.
   - `docker rmi <image>`: Removes an image.
   - `docker logs <container>`: Fetches logs of a container.
   - `docker exec -it <container> <command>`: Executes a command in a running container (e.g., `bash` to get a shell).

### 8. **What is a container registry? How would you retrieve and upload images to DockerHub?**
   - A **container registry** is a repository where Docker images are stored and shared, either publicly or privately. Examples include **DockerHub**, AWS ECR, and Azure Container Registry.
   - **Retrieve (Pull)**: Use `docker pull <imageName>` to download an image from a container registry.
   - **Upload (Push)**: Use `docker push <imageName>` to upload an image to a container registry like DockerHub.

### 9. **If you want to store state for a container, how does Docker recommend doing that?**
   - Docker recommends using **volumes** to store state. A volume is a persistent storage mechanism that is mounted to a container's file system but exists on the host. Even if the container is deleted, the data in the volume persists.
   - Alternatively, you can connect your container to an **external state management service** such as a database, which will store the state independently from the container.

# DevOps

### 1. **What is DevOps? What is the goal of various DevOps processes?**
   - **DevOps** is a set of practices that combine software development (Dev) and IT operations (Ops). It aims to shorten the development lifecycle, increase deployment frequency, and deliver high-quality software reliably. The main goals include improving collaboration between development and operations teams, automating manual processes, and increasing the speed and quality of software releases.

### 2. **Explain CI/CD. What is the difference between Continuous Deployment and Continuous Delivery?**
   - **CI/CD** stands for **Continuous Integration** and **Continuous Delivery/Deployment**. It is a method of automating software development, testing, and deployment.
     - **Continuous Integration (CI)**: Developers frequently merge code changes into a shared repository, where automated builds and tests are run.
     - **Continuous Delivery (CD)**: Builds and tests are automatically deployed to a staging environment after passing CI, but manual approval is needed for production deployment.
     - **Continuous Deployment**: Every code change that passes all automated tests and checks is automatically deployed to production without manual intervention.

### 3. **What tools have you used to achieve CI/CD? Explain how you’ve set up and used them**
   - Common tools for CI/CD include **Jenkins**, **GitHub Actions**, **GitLab CI**, **CircleCI**, and **Travis CI**.
     - Example: With **Jenkins**, you configure a Jenkins pipeline using a Jenkinsfile to automate the process of building, testing, and deploying an application. The pipeline triggers on code changes (push or pull request), builds the project, runs tests, and deploys to the staging or production environment.

### 4. **What is a DevOps pipeline? Explain the steps to setting one up**
   - A **DevOps pipeline** automates the steps required to build, test, and deploy code, enabling teams to deliver software faster and more reliably.
   - **Steps to setting up a DevOps pipeline**:
     1. **Version Control Integration**: Connect the pipeline to a source code repository (e.g., GitHub).
     2. **Build Stage**: Automate the compilation and packaging of the application.
     3. **Test Stage**: Run unit tests, integration tests, and any other automated tests.
     4. **Deploy Stage**: Deploy the application to a staging or production environment.
     5. **Monitoring**: Track the pipeline’s success, errors, and deployment metrics.

### 5. **What is a Jenkinsfile?**
   - A **Jenkinsfile** is a text file that contains the definition of a Jenkins pipeline. It describes the steps of the CI/CD pipeline, including the build, test, and deploy stages, using either declarative or scripted syntax.

### 6. **What is a Jenkins Job? How is it different than a Jenkins Pipeline?**
   - A **Jenkins Job** is a single task configured within Jenkins, such as building and testing code or running a script. It is usually more static and linear than a pipeline.
   - A **Jenkins Pipeline** is a more advanced concept that can handle complex workflows, automating multiple stages like building, testing, and deploying. Pipelines can be version-controlled using a Jenkinsfile.

### 7. **How to set up a Jenkins CI/CD Pipeline?**
   - **Step 1**: Install Jenkins and configure the necessary plugins (e.g., Git, Pipeline, Docker).
   - **Step 2**: Create a new pipeline job in Jenkins.
   - **Step 3**: Write a **Jenkinsfile** that defines the steps in your CI/CD process (e.g., clone repository, build the code, run tests, and deploy).
   - **Step 4**: Set up triggers (e.g., trigger the pipeline when code is pushed to the repository).
   - **Step 5**: Run the pipeline and monitor the stages for any issues.

### 8. **What is a “build”? What is the end result of a build? What is the build tool you’ve used for Java projects?**
   - A **build** refers to the process of compiling and packaging an application into a deployable format (e.g., a `.jar` or `.war` file for Java projects).
   - The **end result of a build** is a packaged application that can be deployed to staging, production, or any environment.
   - Common **build tools for Java projects** include **Maven** and **Gradle**.

### 9. **How can you check what caused a build to fail?**
   - To check what caused a build to fail:
     - Look at the **build logs** provided by the CI tool (e.g., Jenkins).
     - Check the **error messages** in the logs, which indicate compilation errors, test failures, or issues with deployment.
     - Review the **code changes** that triggered the build to identify potential bugs.

### 10. **What is SonarQube / SonarCloud? Explain some of the features of it**
   - **SonarQube** is a tool for continuous inspection of code quality. It helps developers and teams track code quality issues, including bugs, vulnerabilities, and code smells.
   - **Features**:
     - **Code Analysis**: Analyzes code for bugs, vulnerabilities, and maintainability issues.
     - **Code Coverage**: Integrates with test tools to track code coverage.
     - **Security Reports**: Detects potential security vulnerabilities in code.
     - **Code Smells**: Identifies inefficient or non-optimal coding practices that can be improved.
     - **Dashboards**: Provides visual dashboards to track code quality over time.

## SDLC

### 1. **What are the steps in the software development lifecycle (SDLC)?**
   The SDLC typically consists of the following phases:
   1. **Requirement Gathering and Analysis**: Define the requirements for the project.
   2. **Design**: Create the architecture and design based on requirements.
   3. **Implementation (Coding)**: Develop the software by writing the code.
   4. **Testing**: Test the software for bugs and issues.
   5. **Deployment**: Deploy the software to the production environment.
   6. **Maintenance**: Provide ongoing support, bug fixes, and updates.

### 2. **What is the difference between Waterfall and Agile methodologies? Explain the benefits and drawbacks of each**
   - **Waterfall**:
     - A linear, sequential approach where each phase of development must be completed before the next begins.
     - **Benefits**: Clear structure, easy to manage, well-suited for small projects with well-defined requirements.
     - **Drawbacks**: Inflexible, difficult to accommodate changes once the process has started, slow feedback loops.

   - **Agile**:
     - An iterative approach where work is broken down into small, manageable pieces (sprints) and delivered incrementally.
     - **Benefits**: Flexible, allows for changes in requirements, frequent feedback, and faster delivery of functional components.
     - **Drawbacks**: Requires high collaboration and communication, may lack detailed documentation, can lead to scope creep.

### 3. **List some of the principles declared in the Agile manifesto**
   - **Individuals and interactions** over processes and tools.
   - **Working software** over comprehensive documentation.
   - **Customer collaboration** over contract negotiation.
   - **Responding to change** over following a plan.

### 4. **What specific Agile frameworks exist? What are the main features of each?**
   - **Scrum**: A framework with fixed-length iterations (sprints), daily stand-ups, and roles like Scrum Master and Product Owner. Focuses on team collaboration and iterative development.
   - **Kanban**: Focuses on continuous delivery and visualizing work. It uses a board (Kanban board) to manage workflow with a focus on limiting work-in-progress (WIP).
   - **Extreme Programming (XP)**: Emphasizes frequent releases in short development cycles, automated testing, and continuous integration. Practices include pair programming, test-driven development (TDD), and collective code ownership.
   - **Lean**: Focuses on delivering value by reducing waste and improving efficiency, derived from Lean manufacturing principles.

### 5. **What is the Scrum process? Explain each of the Scrum ceremonies**
   - **Sprint Planning**: A meeting where the team defines the goals and backlog items to be completed in the upcoming sprint.
   - **Daily Standup (Daily Scrum)**: A short meeting where team members report on what they did yesterday, what they plan to do today, and any blockers they face.
   - **Sprint Review**: A demonstration of the work completed during the sprint, with stakeholders providing feedback.
   - **Sprint Retrospective**: A meeting at the end of the sprint to reflect on what went well, what didn’t, and what improvements can be made for the next sprint.

### 6. **How long is a typical sprint?**
   - A typical sprint lasts between **1 to 4 weeks**, with **2 weeks** being the most common duration.

### 7. **What is a “standup” and what should you report about your work?**
   - A **standup** (or Daily Scrum) is a short, daily meeting for the team to synchronize work and address any issues. Each team member typically reports:
     1. **What they did yesterday**
     2. **What they plan to do today**
     3. **Any blockers or obstacles they are facing**

### 8. **What is the role of a “Scrum master” in a project? What about the “Product owner”?**
   - **Scrum Master**: Facilitates Scrum ceremonies, removes blockers, ensures the team follows Scrum principles, and acts as a coach to the team.
   - **Product Owner**: Represents the stakeholders, prioritizes the product backlog, defines user stories, and ensures that the team is building the right product.

### 9. **Explain the following metrics/charts: sprint velocity, burndown chart**
   - **Sprint Velocity**: A measure of how much work a team can complete during a sprint. It is calculated by adding up the story points (or other units of work) completed in each sprint, and is used to predict future sprint capacity.
   - **Burndown Chart**: A visual representation of the work remaining in a sprint or project over time. It shows whether the team is on track to complete the work by the end of the sprint.

### 10. **What is a Scrum board? Have you used any software tools for your team’s Scrum board?**
   - A **Scrum board** is a visual tool used to track the progress of tasks during a sprint. It typically has columns such as "To Do," "In Progress," "In Review," and "Done."
   - **Software tools**: Common tools include **Jira**, **Trello**, **Azure DevOps**, **Asana**, and **ClickUp**.

### 11. **Name some technologies teams can use to keep track of progress on different projects, tasks, and due dates**
   - **Jira**
   - **Trello**
   - **Asana**
   - **Azure DevOps**
   - **Monday.com**
   - **ClickUp**
   - **GitHub Projects**

# Event Driven Architecture

### 1. **What is Event Driven Architecture? What are Events?**
   - **Event Driven Architecture (EDA)** is a design pattern where systems communicate through the production, detection, consumption, and reaction to **events**. 
   - **Events** are records of changes in state or significant occurrences within the system, such as a user logging in, an order being placed, or a sensor recording data.

### 2. **What are some use cases for using Event Driven Architecture?**
   - **Microservices**: Enabling decoupled communication between services.
   - **Real-time processing**: Applications requiring real-time updates, such as financial transactions, IoT data, or live data feeds.
   - **Asynchronous workflows**: Processing tasks that do not need to occur immediately but can be handled later, such as email notifications or background processing.
   - **Scalable systems**: Systems that need to handle large volumes of events and scale dynamically based on the workload.

### 3. **What is an Event Stream in Kafka?**
   - An **Event Stream** in Kafka refers to the continuous flow of events (messages) produced by producers and consumed by consumers. It is essentially the data being transferred across Kafka, stored in topics.

### 4. **What is the use of Kafka?**
   - **Kafka** is a distributed event streaming platform used for building real-time data pipelines and streaming applications. It is highly scalable and can handle high throughput, low-latency data streams. Kafka is often used for event-driven architecture, log aggregation, real-time analytics, and microservice communication.

### 5. **What is the role of a Kafka Broker?**
   - A **Kafka Broker** is responsible for managing and storing messages (events) in Kafka topics. Brokers handle incoming messages from producers and serve them to consumers. A Kafka cluster is composed of multiple brokers to ensure fault tolerance and scalability.

### 6. **What is a topic in Kafka?**
   - A **topic** in Kafka is a logical channel where event data (messages) are stored and categorized. Producers write events to topics, and consumers subscribe to topics to read the events. Topics are partitioned for parallel processing and scalability.

### 7. **What is a Kafka Producer? Consumer?**
   - A **Kafka Producer** is an entity or application that sends (publishes) messages to a Kafka topic.
   - A **Kafka Consumer** is an entity or application that reads (subscribes to) messages from a Kafka topic.

### 8. **How have you used Kafka?**
   - Answering this question will depend on your personal experience. For example:
     - **Example 1**: I have used Kafka to implement a real-time data processing system where different microservices communicated asynchronously by producing and consuming events from Kafka topics.
     - **Example 2**: I have used Kafka to build a scalable log aggregation system, where logs from different services were published to Kafka topics, and a central service consumed them for analysis and monitoring.
