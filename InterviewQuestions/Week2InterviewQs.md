# Week 2 Interview Questions

## HTML-CSS

---

### 1. What is HTML?

**HTML (Hypertext Markup Language)** is the standard markup language used to create web pages. It provides the structure for web content, allowing the inclusion of text, images, links, and other elements to build interactive web pages. HTML defines the layout and organization of a web page's content using a series of elements or tags.

**Key Points:**

- **Hypertext:** Refers to the linking of documents and resources on the web.
- **Markup Language:** Uses tags to define elements within a document.

---

### 2. What is the structure of an HTML document? List some tags. What is `<head>` used for? `<body>`?

**HTML Document Structure:**

An HTML document typically consists of the following parts:

```html
<!DOCTYPE html>
<html>
  <head>
    <title>Page Title</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="styles.css">
    <script src="script.js"></script>
  </head>
  <body>
    <h1>Heading</h1>
    <p>Paragraph of text.</p>
    <img src="image.jpg" alt="Description of image">
    <a href="https://example.com">Link to Example</a>
  </body>
</html>
```

**Some Common HTML Tags:**

- `<html>`: The root element that contains all other elements.
- `<head>`: Contains metadata, links to CSS files, scripts, and other non-visible elements.
- `<body>`: Contains the visible content of the web page.
- `<title>`: Sets the title of the web page, shown in the browser's title bar or tab.
- `<h1>` to `<h6>`: Heading tags, used for titles and subtitles.
- `<p>`: Paragraph tag for text.
- `<img>`: Image tag.
- `<a>`: Anchor tag for hyperlinks.
- `<ul>`, `<ol>`, `<li>`: List tags for unordered and ordered lists.
- `<div>`, `<span>`: Generic container tags for styling and layout.

**Purpose of `<head>`:**

- Contains metadata about the document, such as the character set, title, and links to stylesheets and scripts.
- It does not contain any visible content but is crucial for defining how the page is processed and displayed.

**Purpose of `<body>`:**

- Contains all the visible content of the web page, such as text, images, links, and interactive elements.
- Represents the main portion of the document that is rendered by the browser.

---

### 3. What is a doctype?

A **doctype (Document Type Declaration)** is an instruction to the web browser about what version of HTML the page is written in. It must be the very first thing in your HTML document, before the `<html>` tag. The doctype declaration is not an HTML tag; it’s an instruction to the web browser to ensure proper rendering of the page.

**Example:**

```html
<!DOCTYPE html>
```

- This declaration specifies that the document is an HTML5 document. 
- **Importance:** It triggers the browser to render the page in standards mode, which is important for cross-browser consistency.

---

### 4. What is the tag for an ordered list? Unordered list?

**Ordered List:**

- **Tag:** `<ol>`
- Used to create a list with numbered items.

**Example:**

```html
<ol>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ol>
```

**Unordered List:**

- **Tag:** `<ul>`
- Used to create a list with bullet points.

**Example:**

```html
<ul>
  <li>First item</li>
  <li>Second item</li>
  <li>Third item</li>
</ul>
```

- **`<li>` (List Item) Tag:** Used within both `<ol>` and `<ul>` to define each item in the list.

---

### 5. What are some HTML5 tags? Why were HTML5 tags introduced?

**HTML5 Tags:**

HTML5 introduced several new tags to provide more semantic meaning to documents, improve accessibility, and support new multimedia capabilities. Here are some important HTML5 tags:

- **`<header>`:** Defines a header for a document or section.
- **`<footer>`:** Defines a footer for a document or section.
- **`<article>`:** Represents a self-contained piece of content that could be independently distributed or reused.
- **`<section>`:** Defines a section in a document, used for thematic grouping.
- **`<aside>`:** Represents content related to the main content but considered separate from it.
- **`<nav>`:** Defines navigation links, typically for menus.
- **`<figure>` and `<figcaption>`:** Used for figures, images, diagrams, and their captions.
- **`<main>`:** Represents the main content of the document.
- **`<audio>` and `<video>`:** Used to embed audio and video content.
- **`<canvas>`:** A container for graphics, often used with JavaScript for drawing.

**Why HTML5 Tags Were Introduced:**

- **Semantic Structure:** Provides more meaningful and descriptive tags for structuring web content.
- **Accessibility:** Improves accessibility for assistive technologies by clearly defining different parts of the document.
- **Rich Media Support:** Native support for audio, video, and other multimedia content without requiring plugins.
- **Enhanced APIs:** New APIs and features, such as geolocation, local storage, and offline capabilities.

---

### 6. Do all tags come in a pair? What are the other things inside tags called? List some.

Not all HTML tags come in pairs. Tags can be categorized as either **paired tags** (with both an opening and closing tag) or **self-closing tags**.

**Paired Tags:** 

These tags have both an opening and a closing tag, enclosing content between them.

- **Example:** 

  ```html
  <p>This is a paragraph.</p>
  ```

**Self-Closing Tags:** 

These tags do not require a closing tag and do not enclose content. They are typically used for elements that do not have any content.

- **Example:** 

  ```html
  <img src="image.jpg" alt="Description of image" />
  <br />
  ```

### Attributes Inside Tags

Attributes are used to provide additional information about elements. They appear inside the opening tag and consist of a name and value pair.

**Examples of Attributes:**

1. **`id`:** A unique identifier for the element.

   ```html
   <div id="header">...</div>
   ```

2. **`class`:** A class name for the element, used for styling or scripting.

   ```html
   <p class="highlight">...</p>
   ```

3. **`src`:** Specifies the source of an external resource, such as an image or script.

   ```html
   <img src="image.jpg" alt="Description of image" />
   ```

4. **`alt`:** Provides alternative text for images, used for accessibility.

   ```html
   <img src="image.jpg" alt="Description of image" />
   ```

5. **`href`:** Specifies the URL for a link.

   ```html
   <a href="https://example.com">Visit Example</a>
   ```

6. **`style`:** Inline CSS styles for the element.

   ```html
   <p style="color: red;">...</p>
   ```

7. **`title`:** Additional information about the element, often displayed as a tooltip.

   ```html
   <button title="Click me">Button</button>
   ```

---

### 7. What is the syntax for a comment in HTML?

The syntax for a comment in HTML is to enclose the comment text within `<!--` and `-->`. Comments are not displayed in the browser and are used to provide notes or explanations in the source code.

**Example:**

```html
<!-- This is a comment -->
<p>This paragraph will be displayed on the web page.</p>
```

**Usage:**

- **Documentation:** Describe sections of the code for clarity.
- **Temporary Removal:** Comment out code without deleting it to test changes.

---

### 8. Give me the HTML markup for a table.

Here is a basic example of HTML markup for a table:

```html
<table>
  <thead>
    <tr>
      <th>Header 1</th>
      <th>Header 2</th>
      <th>Header 3</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Row 1, Cell 1</td>
      <td>Row 1, Cell 2</td>
      <td>Row 1, Cell 3</td>
    </tr>
    <tr>
      <td>Row 2, Cell 1</td>
      <td>Row 2, Cell 2</td>
      <td>Row 2, Cell 3</td>
    </tr>
  </tbody>
  <tfoot>
    <tr>
      <td colspan="3">Footer</td>
    </tr>
  </tfoot>
</table>
```

**Table Tags Explained:**

- **`<table>`:** Defines the table container.
- **`<thead>`:** Contains the table header row(s).
- **`<th>`:** Defines a header cell in the table.
- **`<tbody>`:** Contains

 the table body rows.
- **`<tr>`:** Defines a table row.
- **`<td>`:** Defines a standard cell in the table.
- **`<tfoot>`:** Contains the table footer row(s).

---

### 9. What are some tags you would use in a form?

Forms in HTML are used to collect user input. Here are some commonly used form tags:

- **`<form>`:** Defines the form container and attributes like action and method.

  ```html
  <form action="/submit" method="post">
    <!-- Form elements here -->
  </form>
  ```

- **`<input>`:** Input fields for various types of data.

  ```html
  <input type="text" name="username" placeholder="Enter your username" />
  <input type="email" name="email" placeholder="Enter your email" />
  <input type="password" name="password" placeholder="Enter your password" />
  ```

- **`<label>`:** Labels for input elements, enhancing accessibility.

  ```html
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" />
  ```

- **`<textarea>`:** Multi-line text input.

  ```html
  <textarea name="message" rows="4" cols="50">Enter your message here...</textarea>
  ```

- **`<select>` and `<option>`:** Drop-down list.

  ```html
  <select name="country">
    <option value="us">United States</option>
    <option value="ca">Canada</option>
  </select>
  ```

- **`<button>`:** Button for form submission or actions.

  ```html
  <button type="submit">Submit</button>
  ```

- **`<fieldset>` and `<legend>`:** Groups related form elements, providing context.

  ```html
  <fieldset>
    <legend>Personal Information</legend>
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" />
  </fieldset>
  ```

- **`<datalist>`:** Provides a list of predefined options for an `<input>`.

  ```html
  <input list="browsers" name="browser" />
  <datalist id="browsers">
    <option value="Chrome">
    <option value="Firefox">
  </datalist>
  ```

---

### 10. What is CSS? What are the different ways of styling an HTML file? Which is best? Why?

**CSS (Cascading Style Sheets):** 

CSS is a stylesheet language used to describe the presentation of a document written in HTML or XML. It allows you to control the layout, colors, fonts, spacing, and overall appearance of a web page.

**Different Ways of Styling an HTML File:**

1. **Inline CSS:** Styles are applied directly to individual HTML elements using the `style` attribute.

   **Example:**

   ```html
   <p style="color: blue; font-size: 18px;">This is a blue paragraph.</p>
   ```

   **Pros:** Quick and easy for small changes.

   **Cons:** Difficult to maintain, doesn't separate content and presentation, and can lead to bloated HTML code.

2. **Internal CSS:** Styles are defined within a `<style>` tag inside the `<head>` section of the HTML document.

   **Example:**

   ```html
   <head>
     <style>
       body {
         font-family: Arial, sans-serif;
       }
       h1 {
         color: red;
       }
     </style>
   </head>
   ```

   **Pros:** Useful for styling a single document.

   **Cons:** Still doesn't fully separate content from presentation, can be repetitive if the same styles are needed on multiple pages.

3. **External CSS:** Styles are defined in a separate `.css` file, linked to the HTML document using the `<link>` tag.

   **Example:**

   ```html
   <head>
     <link rel="stylesheet" href="styles.css">
   </head>
   ```

   **External CSS File (`styles.css`):**

   ```css
   body {
     font-family: Arial, sans-serif;
   }
   h1 {
     color: red;
   }
   ```

   **Pros:** Promotes the separation of content and presentation, allows for site-wide consistency and easy maintenance, and reduces redundancy.

   **Cons:** Requires additional HTTP requests for loading external files (can be mitigated with caching).

**Which is Best? Why?**

**External CSS** is generally considered the best approach for styling because:

- **Separation of Concerns:** It separates content (HTML) from presentation (CSS), leading to cleaner and more maintainable code.
- **Reusability:** Styles can be reused across multiple HTML documents, promoting consistency.
- **Maintainability:** Changes can be made in one place, affecting all linked documents, making maintenance easier.
- **Performance:** Once cached, an external CSS file can reduce page load times across the site.

---

### 11. Describe the CSS box model.

The **CSS box model** is a fundamental concept for understanding how elements are rendered and spaced on a web page. Every HTML element is considered a box, and the box model describes how the space for an element is calculated.

**Components of the Box Model:**

1. **Content:** The actual content of the element, such as text, images, or other media.

2. **Padding:** The space between the content and the border. Padding adds space inside the element's border.

3. **Border:** The line that surrounds the padding (if any) and content. Borders can be styled with color, width, and style (e.g., solid, dashed).

4. **Margin:** The space outside the border, creating distance between the element and other elements on the page.

**Visual Representation:**

```
+---------------------------+
|        Margin             |
|  +---------------------+  |
|  |     Border          |  |
|  |  +---------------+  |  |
|  |  |   Padding     |  |  |
|  |  |  +---------+  |  |  |
|  |  |  | Content |  |  |  |
|  |  |  +---------+  |  |  |
|  |  +---------------+  |  |
|  +---------------------+  |
+---------------------------+
```

**Example CSS:**

```css
.element {
  width: 200px;
  height: 100px;
  padding: 10px;
  border: 5px solid black;
  margin: 15px;
}
```

**Calculating Total Element Size:**

- **Width:** Content width + left padding + right padding + left border + right border + left margin + right margin
- **Height:** Content height + top padding + bottom padding + top border + bottom border + top margin + bottom margin

**Example Calculation:**

For the above CSS:

- **Total Width:** 200px (content) + 10px (left padding) + 10px (right padding) + 5px (left border) + 5px (right border) + 15px (left margin) + 15px (right margin) = 260px
- **Total Height:** 100px (content) + 10px (top padding) + 10px (bottom padding) + 5px (top border) + 5px (bottom border) + 15px (top margin) + 15px (bottom margin) = 160px

**`box-sizing` Property:**

The `box-sizing` property allows you to control how the dimensions of the box model are calculated:

- **`content-box` (default):** The width and height properties apply to the element's content box. Padding and border are added outside the box.
  
- **`border-box`:** The width and height properties include content, padding, and border. This makes it easier to maintain fixed dimensions for an element.

**Example:**

```css
.element {
  box-sizing: border-box;
}
```

---

### 12. Which way has the highest priority when styles cascade: inline, internal, and external?

**Priority of CSS Styles:**

CSS follows the **Cascading** rules, where styles are applied based on their source and specificity. Here’s the order of precedence from highest to lowest priority:

1. **Inline Styles:** Directly applied to an HTML element using the `style` attribute. Inline styles have the highest priority.

   **Example:**

   ```html
   <p style="color: red;">This text is red.</p>
   ```

2. **Internal Styles:** Defined within a `<style>` tag in the `<head>` section of the document. Internal styles override external styles but are overridden by inline styles.

   **Example:**

   ```html
   <head>
     <style>
       p {
         color: blue;
       }
     </style>
   </head>
   ```

3. **External Styles:** Linked from an external `.css` file using the `<link>` tag. External styles are applied last in the order of precedence.

   **Example:**

   ```html
   <head>
     <link rel="stylesheet" href="styles.css">
   </head>
   ```

**Example External CSS:**

```css
p {
  color: green;
}
```

**Other Factors Affecting Priority:**

- **Specificity:** Styles with higher specificity take precedence over styles with lower specificity, regardless of the source. Specificity is determined by the types of selectors used.
  
- **Importance:** The

 `!important` declaration overrides any other conflicting styles, regardless of their source or specificity. However, it should be used sparingly, as it can make styles difficult to manage.

**Example of `!important`:**

```css
p {
  color: yellow !important;
}
```

**Example Order of Precedence:**

```html
<head>
  <style>
    p {
      color: blue; /* Internal Style */
    }
  </style>
  <link rel="stylesheet" href="styles.css"> <!-- External Style -->
</head>
<body>
  <p style="color: red;">This text is red.</p> <!-- Inline Style -->
</body>
```

- **Final Rendered Color:** Red, because inline styles have the highest priority.

---

### 13. Syntax for styling an element? What is a class and how to style them? What is an id? How to style? Difference?

**Syntax for Styling an Element:**

The basic syntax for applying styles to an element using CSS consists of a selector, followed by curly braces containing property-value pairs.

```css
selector {
  property: value;
  property: value;
}
```

**Example:**

```css
p {
  color: blue;
  font-size: 16px;
}
```

**Classes:**

- **Definition:** Classes are used to style multiple elements with similar styling. They are reusable and can be applied to any number of elements.
  
- **Syntax:** Classes are defined in CSS with a dot (`.`) followed by the class name.

- **Example Usage:**

  ```html
  <p class="highlight">This is highlighted text.</p>
  <span class="highlight">This is also highlighted.</span>
  ```

  ```css
  .highlight {
    color: green;
    font-weight: bold;
  }
  ```

**IDs:**

- **Definition:** IDs are unique identifiers used to style a single element. An ID should be used only once per page.
  
- **Syntax:** IDs are defined in CSS with a hash (`#`) followed by the ID name.

- **Example Usage:**

  ```html
  <div id="header">This is the header.</div>
  ```

  ```css
  #header {
    background-color: lightblue;
    padding: 10px;
  }
  ```

**Differences Between Class and ID:**

- **Uniqueness:** Classes can be reused for multiple elements, while IDs are unique to a single element.
  
- **Specificity:** IDs have higher specificity than classes. This means if both a class and an ID style conflict, the ID will take precedence.
  
- **Use Cases:** Use classes for styling groups of elements and IDs for targeting specific elements, such as for navigation or JavaScript manipulation.

**Example of Specificity:**

```html
<div class="box" id="uniqueBox">Styled Box</div>
```

```css
.box {
  color: blue;
}

#uniqueBox {
  color: red;
}
```

- **Rendered Color:** Red, because the ID `#uniqueBox` has higher specificity.

---

### 14. What if I want to select child elements? What syntax is that?

To select child elements in CSS, you can use the **child combinator** or **descendant selector**.

#### Child Combinator (`>`)

The child combinator selects only the direct children of an element.

**Syntax:**

```css
parent > child {
  /* Styles */
}
```

**Example:**

```html
<ul>
  <li>Item 1</li>
  <li>
    Item 2
    <ul>
      <li>Sub-item 1</li>
      <li>Sub-item 2</li>
    </ul>
  </li>
  <li>Item 3</li>
</ul>
```

```css
ul > li {
  color: blue; /* Applies only to direct children of ul */
}
```

- **Explanation:** In this example, only the top-level `<li>` items under the `<ul>` will be styled in blue. The nested `<li>` items will not be affected.

#### Descendant Selector (Space)

The descendant selector targets all descendants (not just direct children) of a given element.

**Syntax:**

```css
ancestor descendant {
  /* Styles */
}
```

**Example:**

```html
<div class="container">
  <p>This is a paragraph.</p>
  <div class="inner">
    <p>This is a nested paragraph.</p>
  </div>
</div>
```

```css
.container p {
  color: green; /* Applies to all paragraphs within .container */
}
```

- **Explanation:** In this example, both paragraphs within `.container` will be styled in green, regardless of nesting.

---

### 15. Can I select multiple elements at once? How?

Yes, you can select multiple elements at once by separating the selectors with a comma (`,`).

**Syntax:**

```css
selector1,
selector2,
selector3 {
  /* Shared Styles */
}
```

**Example:**

```html
<h1>Main Heading</h1>
<h2>Subheading</h2>
<p>Paragraph of text.</p>
```

```css
h1,
h2,
p {
  color: purple;
  font-family: Arial, sans-serif;
}
```

- **Explanation:** This example applies the same styles to all `<h1>`, `<h2>`, and `<p>` elements, setting the text color to purple and the font family to Arial.

---


### 16. What is a pseudo-class? What is the syntax for selecting that?

#### What is a Pseudo-Class?

A **pseudo-class** is a keyword added to selectors in CSS that specifies a special state of the selected elements. Pseudo-classes allow you to apply styles based on certain conditions or user interactions, such as when an element is hovered over, focused, or in a specific position within its parent.

**Common Use Cases:**

- Applying styles when an element is in a specific state, like when a user hovers over a link or when a form input field is focused.
- Targeting elements based on their position in a list or structure, like selecting the first or last child of a parent element.
- Styling elements based on specific conditions, such as when a checkbox is checked or a button is disabled.

#### Syntax for Selecting a Pseudo-Class

The syntax for using a pseudo-class in CSS is to append a colon (`:`) followed by the pseudo-class name to the selector.

**Syntax:**

```css
selector:pseudo-class {
  /* Styles */
}
```

#### Common Pseudo-Classes and Examples

Here are some common pseudo-classes with examples:

1. **`:hover`**

   Applies styles when the user hovers over an element with the mouse pointer.

   ```css
   a:hover {
     color: red;
     text-decoration: underline;
   }
   ```

   - **Usage:** Used to highlight links when the user hovers over them.

2. **`:focus`**

   Applies styles when an element, such as an input field, gains focus.

   ```css
   input:focus {
     border-color: blue;
     outline: none;
   }
   ```

   - **Usage:** Highlights input fields when they are selected, improving user experience in forms.

3. **`:active`**

   Applies styles when an element is activated, typically when clicked.

   ```css
   button:active {
     background-color: yellow;
   }
   ```

   - **Usage:** Provides feedback when buttons or links are clicked.

4. **`:first-child`**

   Selects the first child of its parent.

   ```css
   li:first-child {
     font-weight: bold;
   }
   ```

   - **Usage:** Highlights the first item in a list.

5. **`:last-child`**

   Selects the last child of its parent.

   ```css
   li:last-child {
     color: green;
   }
   ```

   - **Usage:** Styles the last item in a list differently from others.

6. **`:nth-child(n)`**

   Selects the nth child of its parent.

   ```css
   li:nth-child(2) {
     background-color: lightgray;
   }
   ```

   - **Usage:** Styles specific items within a parent element.

7. **`:not(selector)`**

   Selects elements that do not match the given selector.

   ```css
   p:not(.highlight) {
     color: gray;
   }
   ```

   - **Usage:** Applies styles to elements that do not have a certain class.

8. **`:checked`**

   Applies styles to checked form elements, such as checkboxes and radio buttons.

   ```css
   input:checked {
     border-color: green;
   }
   ```

   - **Usage:** Changes the appearance of checked checkboxes or radio buttons.

9. **`:disabled`**

   Applies styles to disabled form elements.

   ```css
   button:disabled {
     background-color: #ccc;
     cursor: not-allowed;
   }
   ```

   - **Usage:** Indicates that a button is disabled and cannot be clicked.

10. **`:visited`**

   Applies styles to links that have already been visited.

   ```css
   a:visited {
     color: purple;
   }
   ```

   - **Usage:** Differentiates visited links from unvisited ones.

11. **`:empty`**

   Selects elements that have no children.

   ```css
   div:empty {
     display: none;
   }
   ```

   - **Usage:** Hides empty containers or elements.

12. **`:first-of-type`**

   Selects the first element of its type within a parent.

   ```css
   p:first-of-type {
     font-size: 18px;
   }
   ```

   - **Usage:** Styles the first paragraph within a parent container.

13. **`:last-of-type`**

   Selects the last element of its type within a parent.

   ```css
   p:last-of-type {
     font-style: italic;
   }
   ```

   - **Usage:** Styles the last paragraph within a parent container.

14. **`:nth-of-type(n)`**

   Selects the nth element of its type within a parent.

   ```css
   p:nth-of-type(2) {
     color: orange;
   }
   ```

   - **Usage:** Styles a specific type of element within a parent.

---

### 17. What is Bootstrap?

**Bootstrap** is a popular open-source front-end framework used for designing responsive and mobile-first web pages. It provides a collection of CSS and JavaScript components, such as grid systems, typography, forms, buttons, navigation bars, modals, and more, that simplify the process of web development.

**Key Features of Bootstrap:**

1. **Responsive Grid System:**

   - Bootstrap includes a responsive grid system that allows developers to create layouts that adapt to different screen sizes and devices. It uses a 12-column layout system with classes for different breakpoints (e.g., `.col-md-6`, `.col-lg-4`).

   ```html
   <div class="container">
     <div class="row">
       <div class="col-md-6">Column 1</div>
       <div class="col-md-6">Column 2</div>
     </div>
   </div>
   ```

2. **Pre-styled Components:**

   - Bootstrap offers a variety of pre-styled components, including buttons, alerts, cards, modals, dropdowns, navigation bars, and more.

   ```html
   <button type="button" class="btn btn-primary">Primary Button</button>
   <div class="alert alert-success" role="alert">This is a success alert!</div>
   ```

3. **Customizable Themes:**

   - Bootstrap provides a default theme that can be easily customized using its SASS variables. Developers can override the default styles to match their project's design requirements.

4. **JavaScript Plugins:**

   - Bootstrap includes a range of JavaScript plugins that add interactivity to elements, such as modals, tooltips, carousels, popovers, and more. These plugins rely on jQuery for DOM manipulation and event handling.

   ```html
   <!-- Modal Trigger -->
   <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
     Launch Modal
   </button>

   <!-- Modal Structure -->
   <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
     <div class="modal-dialog" role="document">
       <div class="modal-content">
         <div class="modal-header">
           <h5 class="modal-title" id="myModalLabel">Modal title</h5>
           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
             <span aria-hidden="true">&times;</span>
           </button>
         </div>
         <div class="modal-body">Modal body content goes here.</div>
         <div class="modal-footer">
           <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
           <button type="button" class="btn btn-primary">Save changes</button>
         </div>
       </div>
     </div>
   </div>
   ```

5. **Cross-Browser Compatibility:**

   - Bootstrap is designed to work seamlessly across all modern browsers, including Chrome, Firefox, Safari, Edge, and Internet Explorer 10+.

6. **Mobile-First Approach:**

   - Bootstrap adopts a mobile-first design philosophy, ensuring that websites are optimized for mobile devices before adapting to larger screens.

7. **Documentation and Community Support:**

   - Bootstrap is well-documented, with comprehensive guides, examples, and a vibrant community that offers support through forums, tutorials, and third-party resources.

**Getting Started with Bootstrap:**

To start using Bootstrap, you can include the Bootstrap CSS and JavaScript files in your HTML document. This can be done by downloading the files or using a CDN (Content Delivery Network).

**Using Bootstrap via CDN:**

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Bootstrap Example</title>
  <!-- Bootstrap CSS -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <h1 class="text-center">Hello, Bootstrap!</h1>
    <button class="btn btn-primary">Bootstrap Button</button>
  </div>

  <!-- jQuery and Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"></script>
</body>


</html>
```

**Using Bootstrap via Package Managers:**

- **npm:** 

  ```bash
  npm install bootstrap
  ```

- **yarn:** 

  ```bash
  yarn add bootstrap
  ```

**Conclusion:**

Bootstrap is a powerful framework for building responsive and visually appealing web pages quickly. Its extensive library of components, customizable styles, and responsive grid system make it an invaluable tool for developers of all skill levels. By leveraging Bootstrap's features, developers can create modern, professional-looking websites with minimal effort, while ensuring a consistent user experience across devices and browsers.


Here are detailed answers to the JavaScript fundamentals questions, ranging from basic to intermediate concepts.

---

## Language Fundamentals

### Basic

---

### **What is JavaScript? What do we use it for?**

**JavaScript (JS)** is a high-level, dynamic, and interpreted programming language primarily used for creating interactive and dynamic content on web pages. It is a core technology of the web, alongside HTML and CSS.

**Uses of JavaScript:**

- **Client-side Web Development:** Adds interactivity and enhances user interfaces on web pages (e.g., sliders, form validation, animations).
  
- **Server-side Development:** With environments like Node.js, JavaScript can be used to build scalable and efficient server-side applications.

- **Mobile App Development:** Using frameworks like React Native, JavaScript can be used to build cross-platform mobile applications.

- **Game Development:** JavaScript can be used to create games that run in the browser or on other platforms.

- **Desktop Applications:** Frameworks like Electron allow JavaScript to be used for creating desktop applications.

---

### **Can we run JavaScript in a web browser, on a server, or both?**

JavaScript can run in **both** environments:

1. **Web Browser:**

   - JavaScript is executed in the browser using the JavaScript engine embedded in browsers like Chrome (V8), Firefox (SpiderMonkey), Safari (JavaScriptCore), and Edge (Chakra).

   **Example Usage in a Web Browser:**

   ```html
   <script>
     console.log('Hello, World!');
   </script>
   ```

2. **Server:**

   - JavaScript can run on servers using platforms like Node.js, which uses the V8 engine from Chrome. Node.js enables JavaScript to perform server-side operations, such as reading files, handling HTTP requests, and managing databases.

   **Example Usage on a Server:**

   ```javascript
   const http = require('http');

   http.createServer((req, res) => {
     res.writeHead(200, { 'Content-Type': 'text/plain' });
     res.end('Hello, World!\n');
   }).listen(8080);
   ```

   - **Benefits:** Single language across both front-end and back-end, making full-stack development more streamlined.

---

### **What are the benefits of JS over your core language? Drawbacks?**

**Benefits of JavaScript:**

1. **Ubiquity:**

   - JavaScript is supported by all modern web browsers, making it a go-to language for client-side web development.

2. **Interactivity:**

   - It allows for the creation of interactive and dynamic web pages, enhancing the user experience.

3. **Versatility:**

   - JavaScript can be used for front-end, back-end, mobile app, desktop app, and game development.

4. **Rich Ecosystem:**

   - A vast number of libraries and frameworks (e.g., React, Angular, Vue, Node.js) are available, accelerating development.

5. **Event-driven Programming:**

   - JavaScript excels at handling asynchronous operations and events, making it suitable for real-time applications.

**Drawbacks of JavaScript:**

1. **Security Issues:**

   - JavaScript can be vulnerable to cross-site scripting (XSS) attacks if not properly handled.

2. **Browser Compatibility:**

   - Differences in how browsers interpret JavaScript can lead to inconsistencies across platforms, though modern standards have minimized this.

3. **Lack of Type Safety:**

   - JavaScript is dynamically typed, which can lead to runtime errors and bugs if not carefully managed.

4. **Complex Asynchronous Code:**

   - Managing asynchronous code can become complex, though Promises and async/await have simplified this.

5. **Performance:**

   - JavaScript is generally slower than compiled languages like C++ or Java, though improvements in engine performance have narrowed this gap.

---

### **What programming paradigm(s) does JS support?**

JavaScript is a multi-paradigm language that supports several programming paradigms, allowing developers to choose the most suitable approach for their projects:

1. **Procedural Programming:**

   - Code is structured in a linear fashion, with a sequence of instructions executed one after another.

   **Example:**

   ```javascript
   function calculateSum(a, b) {
     return a + b;
   }
   ```

2. **Object-Oriented Programming (OOP):**

   - JavaScript supports OOP through prototypal inheritance, allowing objects to inherit properties and methods from other objects.

   **Example:**

   ```javascript
   function Person(name, age) {
     this.name = name;
     this.age = age;
   }

   Person.prototype.greet = function () {
     return `Hello, my name is ${this.name}`;
   };
   ```

3. **Functional Programming:**

   - JavaScript supports first-class functions, higher-order functions, and functions as values, enabling a functional programming approach.

   **Example:**

   ```javascript
   const add = (a, b) => a + b;
   const numbers = [1, 2, 3];
   const sum = numbers.reduce(add, 0);
   ```

4. **Event-Driven Programming:**

   - JavaScript's ability to handle events and asynchronous operations makes it suitable for event-driven programming, commonly used in UI interactions and server-side applications.

   **Example:**

   ```javascript
   document.getElementById('button').addEventListener('click', () => {
     console.log('Button clicked!');
   });
   ```

5. **Asynchronous Programming:**

   - JavaScript handles asynchronous tasks using callbacks, Promises, and async/await, allowing non-blocking operations.

   **Example:**

   ```javascript
   async function fetchData() {
     const response = await fetch('https://api.example.com/data');
     const data = await response.json();
     console.log(data);
   }
   ```

---

### **What are the data types in JS?**

JavaScript has several built-in data types, divided into **primitive** and **non-primitive (reference)** types.

#### **Primitive Data Types:**

1. **Number:**

   - Represents both integer and floating-point numbers.

   **Example:**

   ```javascript
   let age = 30;
   let pi = 3.14;
   ```

2. **String:**

   - Represents a sequence of characters enclosed in single, double, or backticks.

   **Example:**

   ```javascript
   let name = 'Alice';
   let greeting = "Hello, World!";
   ```

3. **Boolean:**

   - Represents a logical entity with two values: `true` or `false`.

   **Example:**

   ```javascript
   let isLoggedIn = true;
   let hasAccess = false;
   ```

4. **Undefined:**

   - Represents an uninitialized variable or a missing property.

   **Example:**

   ```javascript
   let result; // undefined
   ```

5. **Null:**

   - Represents an intentional absence of a value, often used as a placeholder for an object.

   **Example:**

   ```javascript
   let selectedObject = null;
   ```

6. **Symbol (ES6):**

   - Represents a unique and immutable value, often used as object keys.

   **Example:**

   ```javascript
   let uniqueID = Symbol('id');
   ```

7. **BigInt (ES11):**

   - Represents integers with arbitrary precision, allowing operations on large numbers beyond the Number type's limit.

   **Example:**

   ```javascript
   let largeNumber = BigInt(9007199254740991);
   ```

#### **Non-Primitive (Reference) Data Types:**

1. **Object:**

   - Represents collections of key-value pairs and more complex entities.

   **Example:**

   ```javascript
   let user = {
     name: 'Bob',
     age: 25,
   };
   ```

2. **Array:**

   - A special type of object for storing ordered collections of values.

   **Example:**

   ```javascript
   let colors = ['red', 'green', 'blue'];
   ```

3. **Function:**

   - A callable object that can be defined with the `function` keyword or as an arrow function.

   **Example:**

   ```javascript
   function greet() {
     return 'Hello!';
   }
   ```

---

### **What is the type of NaN? What is the isNaN function?**

**Type of NaN:**

- **`NaN` (Not-a-Number)** is a special value representing an undefined or unrepresentable numerical result in JavaScript. Surprisingly, the type of `NaN` is `Number`.

**Example:**

```javascript
console.log(typeof NaN); // Output: "number"
```

**The `isNaN` Function:**

- **`isNaN(value)`** is a function that determines whether a given value is an illegal number (Not-a-Number). It returns `true` if the value is `NaN`, and `false` otherwise.

**Example:**

```javascript
console.log(isNaN('Hello')); // Output: true
console.log(isNaN(123));     // Output: false
```

- **Important Note:** `isNaN` can be misleading because it first tries to convert the value to a number. Use `Number.isNaN` for more reliable checks.

**`Number.isNaN` Example:**

```javascript
console.log(Number.isNaN(NaN));      // Output: true
console.log(Number.isNaN('Hello'));  // Output: false
console.log(Number.isNaN(123));      // Output: false
```

---

### **What is the data type of a function?**

In JavaScript, a function is treated as an **object**, specifically a **function object**. Functions can have properties and methods, similar to other objects.

**Example:**

```javascript
function greet() {
  console.log('Hello!');
}

console.log(typeof greet); // Output: "function"
```

**Characteristics:**

- **Callable Object:** Functions can be called or invoked using parentheses `()`.
- **First-Class Functions:** Functions can be assigned to variables, passed as arguments, and returned from other functions.
- **Properties and Methods:** Functions can have properties and methods, such as `length` and `call`.

**Example of Function Properties:**

```javascript
function add(a, b) {
  return a + b;
}

console.log(add.length); // Output: 2 (number of parameters)
```

---

### **What about an array?**

In JavaScript, an **array** is a special type of **object** that is used to store ordered collections of values. Arrays are zero-indexed and can hold values of different data types.

**Example:**

```javascript
let fruits = ['apple', 'banana', 'cherry'];
console.log(typeof fruits); // Output: "object"
```

**Characteristics of Arrays:**

- **Indexed Collection:** Arrays are collections of values indexed by integers, starting at 0.
- **Dynamic Length:** Arrays can change size dynamically, allowing elements to be added or removed.
- **Methods:** Arrays come with various built-in methods for manipulating their contents.

**Example of Array Methods:**

```javascript
let numbers = [1, 2, 3];
numbers.push(4);           // Add an element to the end
console.log(numbers);      // Output: [1, 2, 3, 4]
console.log(numbers.length); // Output: 4
```

---

### **What is the difference between undefined and null?**

Both `undefined` and `null` represent the absence of a value, but they are used in different contexts and have different meanings:

**Undefined:**

- **Meaning:** Represents an uninitialized variable or a missing property. It is the default value assigned to variables that have been declared but not initialized.

- **Usage:** Indicates that a variable has been declared but has not yet been assigned a value.

- **Example:**

  ```javascript
  let result;
  console.log(result); // Output: undefined
  ```

**Null:**

- **Meaning:** Represents an intentional absence of a value. It is explicitly assigned to indicate that a variable should have no value.

- **Usage:** Used to explicitly specify that a variable is empty or to reset a variable.

- **Example:**

  ```javascript
  let selectedObject = null;
  console.log(selectedObject); // Output: null
  ```

**Differences:**

- **Type:** `undefined` is a type itself, while `null` is an object.
- **Purpose:** `undefined` is used by JavaScript to indicate missing values, while `null` is used by developers to indicate intentional absence.

**Comparison Example:**

```javascript
console.log(undefined == null);  // Output: true (loose equality)
console.log(undefined === null); // Output: false (strict equality)
```

---

### **What are JS objects? What is the syntax?**

**JavaScript Objects:**

- **Definition:** Objects are collections of key-value pairs. Keys are strings (or Symbols) that act as property names, and values can be any data type, including other objects and functions.

- **Purpose:** Objects are used to store and manage data in a structured format, representing complex data structures.

**Object Syntax:**

Objects can be created using either the **object literal** syntax or the **constructor function**.

**Object Literal Syntax:**

```javascript
const person = {
  name: 'John',
  age: 30,
  greet: function () {
    return `Hello, my name is ${this.name}`;
  },
};

console.log(person.name); // Output: John
console.log(person.greet()); // Output: Hello, my name is John
```

**Constructor Function Syntax:**

```javascript
function Person(name, age) {
  this.name = name;
  this.age = age;
}

const person = new Person('John', 30);
console.log(person.name); // Output: John
```

**Using `new` Keyword:**

```javascript
const person = new Object();
person.name = 'John';
person.age = 30;
```

---

### **Use the object literal syntax to create an object with some properties**

**Example: Creating an Object with Object Literal Syntax**

```javascript
const car = {
  make: 'Toyota',
  model: 'Corolla',
  year: 2020,
  features: ['Air Conditioning', 'Cruise Control', 'Bluetooth'],
  start: function () {
    return 'The car has started.';
  },
};

console.log(car.make); // Output: Toyota
console.log(car.start()); // Output: The car has started.
```

**Explanation:**

- **`make`, `model`, `year`:** Properties with string and number values.
- **`features`:** Property with an array value.
- **`start`:** Property with a function value, acting as a method.

---

### **What are arrays in JS? Can you change their size?**

**Arrays in JavaScript:**

- **Definition:** Arrays are ordered collections of values, each identified by an index. They can hold values of different types, including numbers, strings, objects, and other arrays.

**Characteristics:**

- **Dynamic Size:** Arrays in JavaScript are dynamic, meaning you can change their size by adding or removing elements.
- **Zero-Indexed:** The index of the first element is 0, the second element is 1, and so on.

**Example:**

```javascript
let colors = ['red', 'green', 'blue'];
console.log(colors.length); // Output: 3
```

**Changing Array Size:**

- **Adding Elements:** Use methods like `push`, `unshift`, or direct index assignment to add elements.

  ```javascript
  colors.push('yellow'); // Add to the end
  colors.unshift('purple'); // Add to the beginning
  console.log(colors); // Output: ['purple', 'red', 'green', 'blue', 'yellow']
  ```

- **Removing Elements:** Use methods like `pop`, `shift`, or `splice` to remove elements.

  ```javascript
  colors.pop(); // Remove from the end
  colors.shift(); // Remove from the beginning
  console.log(colors); // Output: ['red', 'green', 'blue']
  ```

- **Modifying Length:** You can also change the length property directly.

  ```javascript
  colors.length = 2; // Truncate to the first two elements
  console.log(colors); // Output: ['red', 'green']
  ```

---

### **List some array methods and explain how they work.**

JavaScript provides a variety of built-in methods for manipulating arrays. Here are some commonly used array methods:

1. **`push()`**

   - **Purpose:** Adds one or more elements to the end of an array and returns the new length.

   **Example:**

   ```javascript
   const fruits = ['apple', 'banana'];
   fruits.push('cherry');
   console.log(fruits); // Output: ['apple', 'banana', 'cherry']
   ```

2. **`pop()`**

   - **Purpose:** Removes the last element from an array and returns it.

   **Example:**

   ```javascript
   const colors = ['red', 'green', 'blue'];
   const lastColor = colors.pop();
   console.log(lastColor); // Output: 'blue'
   console.log(colors); // Output: ['red', 'green']
   ```

3. **`shift()`**

   - **Purpose:** Removes the first element from an array and returns it.

   **Example:**

   ```javascript
   const numbers = [1, 2, 3];
   const firstNumber = numbers.shift();
   console.log(firstNumber); // Output: 1
   console.log(numbers); // Output: [2, 3]
   ```

4. **`unshift()`**

   - **Purpose:** Adds one or more elements to the beginning of an array and returns the new length.

   **Example:**

   ```javascript
   const animals = ['cat', 'dog'];
   animals.unshift('bird');
   console.log(animals); // Output: ['bird', 'cat', 'dog']
   ```

5. **`splice()`**

   - **Purpose:** Changes the contents of an array by removing, replacing, or adding elements.

   **Example:**

   ```javascript
   const cars = ['Ford', 'Toyota', 'Honda'];
   cars.splice(1, 1, 'Tesla'); // Removes 'Toyota' and adds 'Tesla'
   console.log(cars); // Output: ['Ford', 'Tesla', 'Honda']
   ```

6. **`slice()`**

   - **Purpose:** Returns a shallow copy of a portion of an array into a new array object.

   **Example:**

   ```javascript
   const letters = ['a', 'b', 'c', 'd'];
   const subset = letters.slice(1, 3);
   console.log(subset); // Output: ['b', 'c']
   ```

7. **`concat()`**

   - **Purpose:** Merges two or more arrays into a new array.

   **Example:**

   ```javascript
   const array1 = [1, 2];
   const array2 = [3, 4];
   const combined = array1.concat

(array2);
   console.log(combined); // Output: [1, 2, 3, 4]
   ```

8. **`indexOf()`**

   - **Purpose:** Returns the first index at which a given element can be found in the array, or -1 if it is not present.

   **Example:**

   ```javascript
   const fruits = ['apple', 'banana', 'cherry'];
   const index = fruits.indexOf('banana');
   console.log(index); // Output: 1
   ```

9. **`find()`**

   - **Purpose:** Returns the first element in the array that satisfies a provided testing function.

   **Example:**

   ```javascript
   const numbers = [10, 20, 30];
   const found = numbers.find((num) => num > 15);
   console.log(found); // Output: 20
   ```

10. **`map()`**

    - **Purpose:** Creates a new array with the results of calling a provided function on every element in the array.

    **Example:**

    ```javascript
    const numbers = [1, 2, 3];
    const doubled = numbers.map((num) => num * 2);
    console.log(doubled); // Output: [2, 4, 6]
    ```

11. **`filter()`**

    - **Purpose:** Creates a new array with all elements that pass the test implemented by the provided function.

    **Example:**

    ```javascript
    const numbers = [5, 10, 15, 20];
    const filtered = numbers.filter((num) => num > 10);
    console.log(filtered); // Output: [15, 20]
    ```

12. **`reduce()`**

    - **Purpose:** Executes a reducer function on each element of the array, resulting in a single output value.

    **Example:**

    ```javascript
    const numbers = [1, 2, 3, 4];
    const sum = numbers.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
    console.log(sum); // Output: 10
    ```

13. **`sort()`**

    - **Purpose:** Sorts the elements of an array in place and returns the sorted array.

    **Example:**

    ```javascript
    const names = ['Charlie', 'Alice', 'Bob'];
    names.sort();
    console.log(names); // Output: ['Alice', 'Bob', 'Charlie']
    ```

14. **`reverse()`**

    - **Purpose:** Reverses the order of the elements in an array.

    **Example:**

    ```javascript
    const numbers = [1, 2, 3];
    numbers.reverse();
    console.log(numbers); // Output: [3, 2, 1]
    ```

15. **`join()`**

    - **Purpose:** Joins all elements of an array into a string.

    **Example:**

    ```javascript
    const words = ['Hello', 'World'];
    const sentence = words.join(' ');
    console.log(sentence); // Output: "Hello World"
    ```

---

### **What is JSON? Is it different from JS objects?**

**JSON (JavaScript Object Notation):**

- **Definition:** JSON is a lightweight data interchange format that is easy for humans to read and write and easy for machines to parse and generate. It is commonly used for transmitting data in web applications (e.g., sending data from server to client).

**Example of JSON:**

```json
{
  "name": "John",
  "age": 30,
  "isStudent": false,
  "courses": ["Math", "Science"],
  "address": {
    "street": "123 Main St",
    "city": "New York"
  }
}
```

**Differences Between JSON and JavaScript Objects:**

1. **Syntax:**

   - **JSON:** Uses a strict syntax with key-value pairs where keys are strings enclosed in double quotes, and values can be strings, numbers, booleans, arrays, or objects.

   - **JavaScript Objects:** Use a similar syntax but are more flexible, allowing keys to be unquoted if they are valid identifiers, and allowing methods and functions as values.

   **Example of a JavaScript Object:**

   ```javascript
   const person = {
     name: 'John',
     age: 30,
     isStudent: false,
     courses: ['Math', 'Science'],
     address: {
       street: '123 Main St',
       city: 'New York',
     },
     greet: function () {
       return 'Hello!';
     },
   };
   ```

2. **Data Types:**

   - **JSON:** Supports a limited set of data types: strings, numbers, booleans, arrays, and objects. Does not support functions, methods, or undefined.

   - **JavaScript Objects:** Support all JavaScript data types, including functions, methods, undefined, and symbols.

3. **Usage:**

   - **JSON:** Used primarily for data interchange between systems, such as APIs and web services.

   - **JavaScript Objects:** Used for storing and manipulating data within a JavaScript program.

4. **Parsing:**

   - **JSON:** Requires parsing and stringifying when converting to and from JavaScript objects.

   **Example:**

   ```javascript
   const jsonString = '{"name":"John","age":30}';
   const jsonObject = JSON.parse(jsonString); // Parse JSON string to object

   const backToString = JSON.stringify(jsonObject); // Convert object to JSON string
   ```

**Summary:**

- JSON is a data format, while JavaScript objects are part of the language itself.
- JSON is useful for data exchange, while JavaScript objects are used for data handling within applications.

---

### **What are some ways you can use functions in JS?**

Functions in JavaScript are versatile and can be used in various ways:

1. **Function Declaration:**

   - Defines a named function using the `function` keyword.

   **Example:**

   ```javascript
   function greet() {
     return 'Hello, World!';
   }
   ```

2. **Function Expression:**

   - Defines a function and assigns it to a variable.

   **Example:**

   ```javascript
   const add = function (a, b) {
     return a + b;
   };
   ```

3. **Arrow Functions (ES6):**

   - A concise syntax for writing functions using the `=>` arrow symbol.

   **Example:**

   ```javascript
   const multiply = (a, b) => a * b;
   ```

4. **Anonymous Functions:**

   - Functions without a name, often used as arguments to other functions.

   **Example:**

   ```javascript
   setTimeout(function () {
     console.log('This is an anonymous function.');
   }, 1000);
   ```

5. **IIFE (Immediately Invoked Function Expression):**

   - A function that is executed immediately after it is defined.

   **Example:**

   ```javascript
   (function () {
     console.log('IIFE executed!');
   })();
   ```

6. **Higher-Order Functions:**

   - Functions that take other functions as arguments or return functions as results.

   **Example:**

   ```javascript
   function applyOperation(a, b, operation) {
     return operation(a, b);
   }

   const sum = applyOperation(3, 5, (x, y) => x + y);
   ```

7. **Methods:**

   - Functions that are properties of objects and can be called using the object's name.

   **Example:**

   ```javascript
   const car = {
     brand: 'Toyota',
     start: function () {
       return 'Car started';
     },
   };

   console.log(car.start());
   ```

8. **Constructors:**

   - Functions used to create objects with the `new` keyword.

   **Example:**

   ```javascript
   function Person(name, age) {
     this.name = name;
     this.age = age;
   }

   const person1 = new Person('Alice', 28);
   ```

9. **Callbacks:**

   - Functions passed as arguments to other functions and called within those functions.

   **Example:**

   ```javascript
   function loadData(callback) {
     // Simulate data loading
     setTimeout(() => {
       const data = 'Sample data';
       callback(data);
     }, 1000);
   }

   loadData((data) => {
     console.log('Data received:', data);
   });
   ```

10. **Closures:**

    - Functions that have access to their outer function's variables, even after the outer function has executed.

    **Example:**

    ```javascript
    function createCounter() {
      let count = 0;
      return function () {
        count += 1;
        return count;
      };
    }

    const counter = createCounter();
    console.log(counter()); // Output: 1
    console.log(counter()); // Output: 2
    ```

**Summary:**

JavaScript functions can be used for various purposes, from simple computations to complex asynchronous operations. They are fundamental building blocks that enable modular and maintainable code.

---

### **What are the different scopes of variables in JS?**

JavaScript has several types of scopes that determine the visibility and lifetime of variables:

1. **Global Scope:**

   - Variables declared outside any function or block have global scope. They are accessible from anywhere in the code.

   **Example:**

   ```javascript
   var globalVar = 'I am global';

   function showGlobalVar() {
     console.log(globalVar);
   }

  

 showGlobalVar(); // Output: I am global
   ```

2. **Function Scope:**

   - Variables declared within a function are only accessible within that function. They are not visible outside the function.

   **Example:**

   ```javascript
   function showLocalVar() {
     var localVar = 'I am local';
     console.log(localVar);
   }

   showLocalVar(); // Output: I am local
   // console.log(localVar); // Error: localVar is not defined
   ```

3. **Block Scope (ES6):**

   - Variables declared with `let` and `const` are block-scoped, meaning they are only accessible within the block they are defined in (e.g., inside a loop or conditional statement).

   **Example:**

   ```javascript
   if (true) {
     let blockVar = 'I am block-scoped';
     console.log(blockVar); // Output: I am block-scoped
   }

   // console.log(blockVar); // Error: blockVar is not defined
   ```

4. **Lexical Scope:**

   - Variables are resolved based on their location in the source code. Inner functions have access to variables declared in their outer scope.

   **Example:**

   ```javascript
   function outerFunction() {
     let outerVar = 'I am outer';

     function innerFunction() {
       console.log(outerVar); // Output: I am outer
     }

     innerFunction();
   }

   outerFunction();
   ```

5. **Module Scope (ES6):**

   - When using JavaScript modules, variables declared in a module are scoped to that module, not polluting the global scope.

   **Example:**

   ```javascript
   // module.js
   const moduleVar = 'I am a module-scoped variable';

   export function showModuleVar() {
     console.log(moduleVar);
   }
   ```

**Summary:**

JavaScript's scope system allows for the organization and protection of variables, ensuring that they are only accessible where intended. Understanding scope is crucial for writing efficient and bug-free code.

---

### **What are the different ways to declare global variables?**

In JavaScript, global variables can be declared in several ways, although it's important to note that using global variables should be minimized to prevent namespace pollution and potential conflicts.

1. **Using `var`:**

   - Variables declared with `var` outside of any function are automatically global.

   **Example:**

   ```javascript
   var globalVar = 'I am a global variable';
   ```

2. **Without `var`, `let`, or `const`:**

   - Assigning a value to a variable without a declaration keyword creates a global variable. This is considered bad practice because it can lead to unexpected behavior and conflicts.

   **Example:**

   ```javascript
   globalVar = 'I am also a global variable';
   ```

3. **Using `window` Object (Browser):**

   - In a browser environment, properties can be added to the `window` object to create global variables.

   **Example:**

   ```javascript
   window.globalVar = 'I am a global variable via window';
   ```

4. **Using `global` Object (Node.js):**

   - In Node.js, the `global` object is used to define global variables.

   **Example:**

   ```javascript
   global.globalVar = 'I am a global variable in Node.js';
   ```

5. **Global Scope with `const` or `let`:**

   - In modern JavaScript (ES6+), using `const` or `let` outside of any block or function creates a global variable.

   **Example:**

   ```javascript
   const globalConst = 'I am a global constant';
   let globalLet = 'I am a global let variable';
   ```

---

### **Is it a best practice to use global variables? Why or why not?**

**Using global variables is generally not considered a best practice.**

**Reasons:**

1. **Namespace Pollution:**

   - Global variables can clash with variables in other scripts or libraries, leading to unexpected behavior.

2. **Tight Coupling:**

   - Global variables can create dependencies between different parts of the code, making it difficult to maintain and test.

3. **Difficulty in Debugging:**

   - Changes to global variables can have far-reaching effects, making it hard to trace and debug issues.

4. **Performance Issues:**

   - Excessive use of global variables can degrade performance, as accessing them can be slower compared to local variables.

5. **Lack of Encapsulation:**

   - Global variables break the principle of encapsulation, where each component should manage its own state independently.

**Best Practices:**

- **Use Local Variables:** Prefer local variables to minimize dependencies and enhance modularity.
- **Limit Global Scope:** Minimize the number of global variables and group them into namespaces or modules if necessary.
- **Use Constants:** If global variables are needed, use constants (`const`) to ensure their values remain unchanged.

---

### **If you declare a variable `var` inside a for loop, is that block scoped or function scoped?**

When a variable is declared with `var` inside a for loop, it is **function scoped**, not block scoped.

**Example:**

```javascript
function testVarScope() {
  for (var i = 0; i < 3; i++) {
    console.log(i); // Logs 0, 1, 2
  }

  console.log(i); // Logs 3 (accessible outside the loop)
}

testVarScope();
```

**Explanation:**

- The variable `i` is accessible outside the loop because `var` does not respect block scope.
- `i` is scoped to the function `testVarScope`, not the for loop itself.

**Conclusion:**

- `var` creates function-scoped variables, making them visible throughout the function.

---

### **If you declare a variable `let` inside a for loop, is that block scoped or function scoped?**

When a variable is declared with `let` inside a for loop, it is **block scoped**.

**Example:**

```javascript
function testLetScope() {
  for (let j = 0; j < 3; j++) {
    console.log(j); // Logs 0, 1, 2
  }

  // console.log(j); // Error: j is not defined
}

testLetScope();
```

**Explanation:**

- The variable `j` is not accessible outside the loop because `let` respects block scope.
- `j` is scoped to the block within the for loop.

**Conclusion:**

- `let` creates block-scoped variables, making them visible only within the block they are defined.

---

### **What are callback functions? What about self-invoking functions?**

**Callback Functions:**

- **Definition:** A callback function is a function passed as an argument to another function and executed after the outer function completes. Callbacks allow for asynchronous programming and handling events.

**Example:**

```javascript
function fetchData(callback) {
  setTimeout(() => {
    const data = 'Sample data';
    callback(data); // Execute the callback with data
  }, 1000);
}

fetchData((data) => {
  console.log('Data received:', data);
});
```

- **Usage:** Commonly used in asynchronous operations, event handling, and functional programming.

**Self-Invoking Functions:**

- **Definition:** A self-invoking (or immediately invoked) function is a function that is executed immediately after its definition. These functions do not need to be called explicitly.

**Example:**

```javascript
(function () {
  console.log('I am a self-invoking function.');
})();
```

- **Usage:** Useful for creating a local scope to avoid polluting the global namespace and for initializing code that needs to run immediately.

**Comparison:**

- **Callbacks:** Functions passed to and executed by other functions. Used for asynchronous operations and event handling.
- **Self-Invoking Functions:** Functions that execute immediately after being defined. Used for creating isolated scopes and immediate execution.

---

### **What is a truthy or falsy value? List the falsy values.**

**Truthy and Falsy Values:**

In JavaScript, every value has an inherent Boolean value, known as either truthy or falsy. When evaluated in a Boolean context, a truthy value becomes `true`, and a falsy value becomes `false`.

**Falsy Values:**

The following values are considered falsy in JavaScript:

1. `false` - The Boolean false.
2. `0` - The number zero.
3. `-0` - Negative zero.
4. `0n` - BigInt zero.
5. `""` - An empty string.
6. `null` - The absence of a value.
7. `undefined` - An uninitialized variable.
8. `NaN` - Not-a-Number.

**Example:**

```javascript
if (0) {
  console.log('This will not run.');
}

if ('') {
  console.log('This will not run either.');
}

if (null) {
  console.log('Nor will this.');
}
```

**Truthy Values:**

All other values, including all objects, non-zero numbers, non-empty strings, and arrays, are considered truthy.

**Example:**

```javascript
if (1) {
  console.log('This will run.');
}

if ('Hello') {
  console.log('This will run too.');
}

if ([]) {
  console.log('And so will this.');
}
```

---

### **What is the difference between == and ===? Which one allows for type coercion?**

**`==` (Equality Operator):**

- **Definition:** Com

pares two values for equality, allowing for type coercion if the values have different types.

**Example:**

```javascript
console.log(5 == '5'); // Output: true (type coercion)
console.log(true == 1); // Output: true (type coercion)
```

- **Type Coercion:** Automatically converts one or both values to a common type before comparison, potentially leading to unexpected results.

**`===` (Strict Equality Operator):**

- **Definition:** Compares two values for equality without allowing type coercion. Both the value and the type must be the same.

**Example:**

```javascript
console.log(5 === '5'); // Output: false (no type coercion)
console.log(true === 1); // Output: false (no type coercion)
```

- **No Type Coercion:** Requires both values to have the same type and value to be considered equal.

**Conclusion:**

- **Use `===`:** It is generally recommended to use the strict equality operator (`===`) to avoid unexpected behavior due to type coercion.

---

### **What is the difference between `for of` and `for in`?**

**`for...of` Loop:**

- **Purpose:** Iterates over iterable objects, such as arrays, strings, maps, and sets, accessing the values of each element.

**Example:**

```javascript
const array = ['a', 'b', 'c'];
for (const value of array) {
  console.log(value); // Output: 'a', 'b', 'c'
}
```

**Usage:**

- Use `for...of` when you need to iterate over values in an iterable, such as an array or string.

**`for...in` Loop:**

- **Purpose:** Iterates over the enumerable properties of an object, accessing the keys (property names) of the object.

**Example:**

```javascript
const object = { key1: 'value1', key2: 'value2' };
for (const key in object) {
  console.log(key); // Output: 'key1', 'key2'
}
```

**Usage:**

- Use `for...in` when you need to iterate over the properties of an object.

**Differences:**

- **`for...of`:** Iterates over values in an iterable. Suitable for arrays, strings, maps, and sets.
- **`for...in`:** Iterates over keys (properties) in an object. Suitable for objects.

**Avoid Using `for...in` on Arrays:**

- Using `for...in` on arrays can lead to unexpected behavior because it iterates over all enumerable properties, including inherited properties.

**Example:**

```javascript
Array.prototype.customMethod = function () {};
const array = ['a', 'b', 'c'];

for (const index in array) {
  console.log(index); // Output: 0, 1, 2, 'customMethod'
}
```

- Use `for...of` for arrays to avoid this issue.

---

### **What is the difference between a do-while and a while loop?**

**`while` Loop:**

- **Purpose:** Repeatedly executes a block of code as long as a specified condition is true. The condition is evaluated before the block is executed, meaning the loop may not run at all if the condition is initially false.

**Syntax:**

```javascript
while (condition) {
  // Code to execute
}
```

**Example:**

```javascript
let count = 0;
while (count < 5) {
  console.log(count);
  count++;
}
// Output: 0, 1, 2, 3, 4
```

**`do-while` Loop:**

- **Purpose:** Similar to the `while` loop, but the block of code is executed at least once, regardless of the condition. The condition is evaluated after the block is executed.

**Syntax:**

```javascript
do {
  // Code to execute
} while (condition);
```

**Example:**

```javascript
let count = 0;
do {
  console.log(count);
  count++;
} while (count < 5);
// Output: 0, 1, 2, 3, 4
```

**Differences:**

- **`while` Loop:**

  - Evaluates the condition before executing the code block.
  - May not execute at all if the condition is initially false.

- **`do-while` Loop:**

  - Executes the code block at least once before evaluating the condition.
  - Ensures the code block runs at least once, even if the condition is false initially.

**Example with a False Initial Condition:**

```javascript
let num = 5;

while (num < 3) {
  console.log('While Loop: ', num);
}

do {
  console.log('Do-While Loop: ', num);
} while (num < 3);

// Output: 'Do-While Loop: 5'
```

**Conclusion:**

- Use `while` when you want the code to execute only if the condition is true.
- Use `do-while` when you need the code to execute at least once, regardless of the condition.

---

### **What is the difference between `console.log(++x)` and `console.log(x++)`?**

**`console.log(++x)`:**

- **Purpose:** The `++x` operation increments the variable `x` by 1 **before** returning its value.

**Example:**

```javascript
let x = 5;
console.log(++x); // Output: 6
console.log(x);   // Output: 6
```

**Explanation:**

- The variable `x` is incremented by 1, and then the new value is returned and logged.

**`console.log(x++)`:**

- **Purpose:** The `x++` operation increments the variable `x` by 1 **after** returning its value.

**Example:**

```javascript
let x = 5;
console.log(x++); // Output: 5
console.log(x);   // Output: 6
```

**Explanation:**

- The current value of `x` is returned and logged, and then `x` is incremented by 1.

**Differences:**

- **Pre-Increment (`++x`)**: Increments the variable before returning its value.
- **Post-Increment (`x++`)**: Returns the current value before incrementing the variable.

**Use Cases:**

- Use **`++x`** when you need the incremented value immediately.
- Use **`x++`** when you need the current value and want to increment it afterward.

**Conclusion:**

- Understanding the difference between pre-increment and post-increment is essential for writing accurate and efficient code.

---

### Intermediate

---

### **What is function and variable hoisting?**

**Function Hoisting:**

- **Definition:** In JavaScript, function declarations are hoisted to the top of their containing scope during the compilation phase, allowing them to be called before they are defined in the code.

**Example:**

```javascript
hoistedFunction(); // Output: "Hoisted!"

function hoistedFunction() {
  console.log('Hoisted!');
}
```

**Explanation:**

- The `hoistedFunction` is available for use before its actual definition because the function declaration is hoisted to the top of its scope.

**Variable Hoisting:**

- **Definition:** Variable declarations using `var` are hoisted to the top of their containing scope. However, only the declaration is hoisted, not the initialization.

**Example:**

```javascript
console.log(hoistedVar); // Output: undefined
var hoistedVar = 'Hoisted Variable';
console.log(hoistedVar); // Output: "Hoisted Variable"
```

**Explanation:**

- The declaration `var hoistedVar` is hoisted to the top, but its initialization (`'Hoisted Variable'`) remains in place. Therefore, `hoistedVar` is undefined until it is assigned a value.

**Limitations with `let` and `const`:**

- Variables declared with `let` and `const` are also hoisted, but they are not initialized until the code execution reaches their declaration. This creates a "temporal dead zone" where accessing the variable before its declaration results in a `ReferenceError`.

**Example:**

```javascript
// console.log(letVar); // Error: Cannot access 'letVar' before initialization
let letVar = 'Let Variable';

console.log(constVar); // Error: Cannot access 'constVar' before initialization
const constVar = 'Const Variable';
```

**Conclusion:**

- Function declarations are fully hoisted, making them available throughout their scope.
- Variable declarations with `var` are hoisted, but their initializations are not.
- `let` and `const` are hoisted but are not initialized, resulting in a temporal dead zone.

---

### **What is closure and when should you use it?**

**Closure:**

- **Definition:** A closure is a function that has access to its outer (enclosing) function's variables and scope, even after the outer function has executed. Closures allow functions to maintain references to variables from their outer scope, enabling the creation of private variables and encapsulated state.

**Example:**

```javascript
function createCounter() {
  let count = 0; // Local variable

  return function () {
    count += 1; // Accessing the outer variable
    return count;
  };
}

const counter = createCounter();
console.log(counter()); // Output: 1
console.log(counter()); // Output: 2
```

**Explanation:**

- The inner function maintains a reference to the `count` variable from its

 outer scope, creating a closure.
- Even after `createCounter` has finished executing, the returned function still has access to `count`.

**When to Use Closures:**

1. **Data Encapsulation:**

   - Closures allow the creation of private variables that cannot be accessed directly from outside the function.

   **Example:**

   ```javascript
   function createSecretCode() {
     const secret = '1234';

     return {
       reveal: function () {
         return secret;
       },
     };
   }

   const secretCode = createSecretCode();
   console.log(secretCode.reveal()); // Output: "1234"
   ```

2. **Function Factories:**

   - Closures can be used to create factory functions that generate functions with specific behavior.

   **Example:**

   ```javascript
   function createMultiplier(factor) {
     return function (number) {
       return number * factor;
     };
   }

   const double = createMultiplier(2);
   console.log(double(5)); // Output: 10
   ```

3. **Event Handlers:**

   - Closures are useful in event handlers to maintain references to variables that were present when the handler was defined.

   **Example:**

   ```javascript
   function attachEventHandler(element) {
     const name = 'Button';
     element.addEventListener('click', function () {
       console.log(`Clicked: ${name}`);
     });
   }
   ```

4. **Iterating with Loops:**

   - Closures can help avoid common pitfalls with loops by preserving the loop variable's value at each iteration.

   **Example:**

   ```javascript
   for (var i = 0; i < 3; i++) {
     setTimeout(
       (function (currentValue) {
         return function () {
           console.log(currentValue);
         };
       })(i),
       1000
     );
   }
   // Output: 0, 1, 2 (after 1 second)
   ```

**Conclusion:**

- Closures are a powerful concept in JavaScript that enables encapsulation, data privacy, and functional programming patterns.
- They provide a way to maintain state and access variables from outer scopes, even after those scopes have exited.

---

Here are detailed answers to the intermediate difficulty JavaScript questions:

---

### **What does the "this" keyword refer to?**

The `this` keyword in JavaScript is a special identifier that refers to the context in which a function is executed. The value of `this` depends on how a function is called, and it allows functions to access properties and methods of the current execution context.

#### **Contexts and the Value of `this`:**

1. **Global Context:**

   - In the global execution context, `this` refers to the global object. In a web browser, the global object is `window`.

   ```javascript
   console.log(this); // Output: Window (in a browser)
   ```

2. **Object Method:**

   - When a function is called as a method of an object, `this` refers to the object itself.

   ```javascript
   const person = {
     name: 'Alice',
     greet: function () {
       console.log(`Hello, ${this.name}`);
     },
   };

   person.greet(); // Output: "Hello, Alice"
   ```

3. **Constructor Function:**

   - When a function is used as a constructor with the `new` keyword, `this` refers to the newly created instance.

   ```javascript
   function Car(brand) {
     this.brand = brand;
   }

   const myCar = new Car('Toyota');
   console.log(myCar.brand); // Output: "Toyota"
   ```

4. **Event Handlers:**

   - In event handlers, `this` refers to the element that received the event.

   ```javascript
   const button = document.getElementById('myButton');
   button.addEventListener('click', function () {
     console.log(this); // Output: <button id="myButton">...</button>
   });
   ```

5. **Arrow Functions:**

   - Arrow functions do not have their own `this` binding. Instead, they inherit `this` from the surrounding lexical context, i.e., the context in which they were defined.

   ```javascript
   const person = {
     name: 'Bob',
     greet: () => {
       console.log(`Hello, ${this.name}`); // `this` is inherited from the surrounding context
     },
   };

   person.greet(); // Output: "Hello, undefined" (or global context name)
   ```

6. **Explicit Binding:**

   - The value of `this` can be explicitly set using `call()`, `apply()`, or `bind()` methods.

   ```javascript
   function greet() {
     console.log(`Hello, ${this.name}`);
   }

   const person = { name: 'Charlie' };
   greet.call(person); // Output: "Hello, Charlie"
   ```

**Conclusion:**

- The `this` keyword in JavaScript is dynamic and determined by the context in which a function is executed. Understanding the context is essential for writing correct and predictable code.

---

### **Explain the concept of lexical scope**

**Lexical Scope:**

Lexical scope is a fundamental concept in JavaScript that determines the accessibility of variables based on their location within the source code. It is also known as static scope because the structure of the source code at the time of writing defines the scope of variables, rather than at runtime.

**Key Concepts:**

1. **Scope Hierarchy:**

   - In JavaScript, the scope is organized hierarchically in a tree-like structure, where each function creates a new scope. Inner functions have access to variables declared in their outer (enclosing) functions, forming a chain of scopes.

2. **Variable Lookup:**

   - When a variable is accessed within a function, JavaScript first looks for the variable in the current scope. If it is not found, it continues to search in the outer scope, moving up the scope chain until it reaches the global scope.

3. **Closure:**

   - Lexical scoping enables closures, which are functions that have access to their outer function's variables even after the outer function has completed execution. Closures capture and remember their lexical environment.

**Example:**

```javascript
function outerFunction() {
  const outerVar = 'I am outside';

  function innerFunction() {
    const innerVar = 'I am inside';
    console.log(outerVar); // Accessing outerVar from outer scope
  }

  innerFunction();
  // console.log(innerVar); // Error: innerVar is not defined
}

outerFunction();
```

**Explanation:**

- **`outerFunction`:** Defines a scope with `outerVar`.
- **`innerFunction`:** Has access to `outerVar` due to lexical scope. However, `outerFunction` cannot access `innerVar` because it is declared in the inner scope.

**Benefits of Lexical Scope:**

1. **Predictability:** The scope of variables is determined at the time of writing code, making it easier to reason about and understand variable accessibility.
2. **Encapsulation:** Functions can encapsulate variables, protecting them from being accessed from outside their scope.
3. **Closures:** Lexical scope enables closures, allowing functions to maintain access to their outer environment even after the outer function has completed execution.

**Conclusion:**

- Lexical scope provides a clear and predictable structure for variable access, enabling powerful features like closures and encapsulation. Understanding lexical scope is essential for writing modular and maintainable code in JavaScript.

---

### **How would you rewrite this using an anonymous function? Arrow function?**

Given the function:

```javascript
function add(a, b) {
  return a + b;
}
```

#### **Using an Anonymous Function:**

An anonymous function is a function without a name, often used as a function expression.

```javascript
const add = function (a, b) {
  return a + b;
};

console.log(add(2, 3)); // Output: 5
```

#### **Using an Arrow Function:**

Arrow functions provide a concise syntax for writing functions, especially useful for simple operations and callbacks.

```javascript
const add = (a, b) => a + b;

console.log(add(2, 3)); // Output: 5
```

**Explanation:**

- **Anonymous Function:** A function is assigned to a variable `add`. The function has no name and is defined using the `function` keyword.
- **Arrow Function:** Uses the arrow (`=>`) syntax to define the function. Parentheses around parameters are optional if there is only one parameter. Curly braces and `return` are optional if the function contains a single expression.

**Benefits of Arrow Functions:**

1. **Conciseness:** Arrow functions allow for a more concise syntax, reducing boilerplate code.
2. **Lexical `this`:** Arrow functions inherit `this` from the surrounding lexical context, avoiding issues with `this` in callbacks.

**Conclusion:**

- Anonymous and arrow functions provide flexibility in defining functions, each with its own use cases and benefits. Arrow functions are especially useful for simple expressions and preserving lexical `this`.

---

### **What is the difference between setInterval() and setTimeout()?**

`setInterval()` and `setTimeout()` are both methods used to schedule code execution in JavaScript. They are part of the Window interface in browsers and are used for timing functions.

#### **`setInterval()`:**

- **Purpose:** Repeatedly executes a specified function at fixed intervals (in milliseconds) until it is explicitly stopped.
- **Syntax:** `setInterval(callback, delay, [arg1, arg2, ...])`

**Example:**

```javascript
const intervalId = setInterval(() => {
  console.log('This message repeats every second.');
}, 1000);
```

- **Use Case:** Useful for tasks that need to run continuously, such as updating a clock or polling for data.

#### **`setTimeout()`:**

- **Purpose:** Executes a specified function after a certain delay (in milliseconds).
- **Syntax:** `setTimeout(callback, delay, [arg1, arg2, ...])`

**Example:**

```javascript
setTimeout(() => {
  console.log('This message appears after 3 seconds.');
}, 3000);
```

- **Use Case:** Useful for tasks that need to be executed once after a delay, such as displaying a welcome message or triggering an animation.

#### **Key Differences:**

1. **Execution:**

   - **`setInterval()`:** Repeatedly executes the function at regular intervals until stopped.
   - **`setTimeout()`:** Executes the function once after a specified delay.

2. **Stopping:**

   - **`setInterval()`:** Must be stopped using `clearInterval(intervalId)`.
   - **`setTimeout()`:** Can be stopped using `clearTimeout(timeoutId)` before the timeout elapses.

3. **Timing Accuracy:**

   - **`setInterval()`:** The interval time includes the time taken to execute the function, which can lead to inaccuracies if the function takes longer to execute than the specified interval.
   - **`setTimeout()`:** The delay does not include the execution time, ensuring the function runs once after the delay.

**Conclusion:**

- Use `setInterval()` for tasks that need repeated execution at intervals.
- Use `setTimeout()` for tasks that require a single execution after a delay.

---

### **How would you stop a setInterval() once it has been set?**

To stop a `setInterval()`, use the `clearInterval()` function, passing the interval ID returned by `setInterval()`.

**Example:**

```javascript
const intervalId = setInterval(() => {
  console.log('This message repeats every second.');
}, 1000);

// Stop the interval after 5 seconds
setTimeout(() => {
  clearInterval(intervalId);
  console.log('Interval stopped.');
}, 5000);
```



**Explanation:**

- `setInterval()` returns an interval ID, which is a unique identifier for the interval.
- `clearInterval(intervalId)` stops the execution of the interval function using the interval ID.

**Conclusion:**

- Stopping intervals is essential for preventing infinite loops and resource leaks, especially in long-running applications.

---

### **Advanced: How do setInterval() and setTimeout() work with regards to the callback queue?**

**Event Loop and Callback Queue:**

Both `setInterval()` and `setTimeout()` rely on the JavaScript event loop and callback queue to execute scheduled functions.

1. **Event Loop:**

   - JavaScript has a single-threaded event loop that handles asynchronous tasks and events. The event loop continuously checks the call stack for functions to execute and processes events from the callback queue.

2. **Callback Queue:**

   - When a timer set by `setInterval()` or `setTimeout()` expires, the callback function is placed in the callback queue, waiting for the call stack to become empty.

3. **Execution:**

   - Once the call stack is empty, the event loop moves the callback from the queue to the call stack, where it is executed.

**Timing Inaccuracies:**

- Both `setInterval()` and `setTimeout()` may experience timing inaccuracies due to the event loop's nature. If the call stack is busy or blocked, the execution of the callback may be delayed.

**Example of Timing Inaccuracy:**

```javascript
setTimeout(() => {
  console.log('This may be delayed if the call stack is busy.');
}, 1000);

console.log('This executes first, even with a delay in setTimeout.');
```

**Conclusion:**

- The event loop and callback queue are essential for handling asynchronous tasks in JavaScript. Understanding their behavior helps manage timers effectively and avoid timing issues.

---

### **How would you handle an error in JS?**

**Handling Errors in JavaScript:**

JavaScript provides mechanisms for handling errors gracefully, allowing developers to catch and respond to runtime exceptions.

1. **`try...catch` Block:**

   - The `try` block contains code that may throw an error. The `catch` block handles the error, preventing the program from crashing.

   **Example:**

   ```javascript
   try {
     const result = JSON.parse('{"name": "Alice"');
     console.log(result);
   } catch (error) {
     console.error('Error parsing JSON:', error.message);
   }
   ```

   **Explanation:**

   - If an error occurs in the `try` block, the control is transferred to the `catch` block, where the error can be logged or handled.

2. **`try...catch...finally` Block:**

   - The `finally` block is optional and executes code regardless of whether an error occurred. It is often used for cleanup operations.

   **Example:**

   ```javascript
   try {
     const data = fetchData();
     console.log(data);
   } catch (error) {
     console.error('Error fetching data:', error.message);
   } finally {
     console.log('Execution complete.');
   }
   ```

   **Explanation:**

   - The `finally` block runs after the `try` and `catch` blocks, regardless of the outcome, ensuring that cleanup code is executed.

3. **Throwing Custom Errors:**

   - Custom errors can be thrown using the `throw` keyword. This allows developers to create meaningful error messages and handle specific scenarios.

   **Example:**

   ```javascript
   function divide(a, b) {
     if (b === 0) {
       throw new Error('Division by zero is not allowed.');
     }
     return a / b;
   }

   try {
     const result = divide(10, 0);
     console.log(result);
   } catch (error) {
     console.error(error.message);
   }
   ```

   **Explanation:**

   - Custom errors provide descriptive messages, allowing developers to handle specific exceptions and provide meaningful feedback to users.

4. **Promise and Async/Await Error Handling:**

   - Errors in asynchronous code can be handled using `.catch()` for Promises and `try...catch` for async/await.

   **Example with Promises:**

   ```javascript
   fetch('https://api.example.com/data')
     .then((response) => response.json())
     .then((data) => console.log(data))
     .catch((error) => console.error('Fetch error:', error));
   ```

   **Example with Async/Await:**

   ```javascript
   async function fetchData() {
     try {
       const response = await fetch('https://api.example.com/data');
       const data = await response.json();
       console.log(data);
     } catch (error) {
       console.error('Fetch error:', error);
     }
   }

   fetchData();
   ```

**Conclusion:**

- Error handling is crucial for building robust and user-friendly applications. Proper error handling prevents crashes, provides meaningful feedback, and ensures a smooth user experience.

---

### **What attributes does an Error object have?**

**Error Object in JavaScript:**

The Error object in JavaScript represents runtime errors and exceptions. It provides useful attributes and methods for diagnosing and handling errors.

#### **Attributes of the Error Object:**

1. **`name`:**

   - **Description:** A string representing the name of the error. Common error types include `Error`, `TypeError`, `ReferenceError`, `SyntaxError`, and `RangeError`.

   **Example:**

   ```javascript
   const error = new Error('Something went wrong');
   console.log(error.name); // Output: "Error"
   ```

2. **`message`:**

   - **Description:** A string containing a human-readable description of the error.

   **Example:**

   ```javascript
   const error = new Error('Something went wrong');
   console.log(error.message); // Output: "Something went wrong"
   ```

3. **`stack`:**

   - **Description:** A string containing the stack trace, which provides information about the call stack at the time the error was thrown. This attribute is particularly useful for debugging.

   **Example:**

   ```javascript
   try {
     throw new Error('Stack trace example');
   } catch (error) {
     console.log(error.stack);
   }
   ```

   **Output:**

   ```
   Error: Stack trace example
       at <anonymous>:2:11
       at Object.InjectedScript._evaluateOn (<anonymous>:905:140)
       at Object.InjectedScript._evaluateAndWrap (<anonymous>:838:34)
       at Object.InjectedScript.evaluate (<anonymous>:694:21)
   ```

4. **`cause` (ES2022):**

   - **Description:** An optional attribute used to specify a nested or previous error, providing context for the current error. This attribute is available in ECMAScript 2022 and later.

   **Example:**

   ```javascript
   try {
     throw new Error('Cause error');
   } catch (cause) {
     const error = new Error('Something went wrong', { cause });
     console.log(error.cause.message); // Output: "Cause error"
   }
   ```

#### **Custom Error Types:**

Developers can create custom error types by extending the built-in Error class. Custom errors can have additional properties and methods for specialized behavior.

**Example of a Custom Error:**

```javascript
class ValidationError extends Error {
  constructor(message, field) {
    super(message);
    this.name = 'ValidationError';
    this.field = field;
  }
}

try {
  throw new ValidationError('Invalid input', 'username');
} catch (error) {
  console.log(error.name); // Output: "ValidationError"
  console.log(error.message); // Output: "Invalid input"
  console.log(error.field); // Output: "username"
}
```

**Conclusion:**

- The Error object provides valuable information about exceptions, aiding in diagnosing and handling errors effectively. Custom error types enhance error handling by adding context-specific details.

---

### **What is an Immediately Invoked Function Expression?**

**Immediately Invoked Function Expression (IIFE):**

An Immediately Invoked Function Expression (IIFE) is a JavaScript function that is executed immediately after it is defined. IIFEs are useful for creating isolated scopes and avoiding variable pollution in the global namespace.

#### **Characteristics of IIFE:**

1. **Anonymous Function:**

   - An IIFE is often an anonymous function, meaning it does not have a name.

2. **Immediate Execution:**

   - The function is executed immediately, without the need to explicitly call it.

3. **Isolated Scope:**

   - Variables declared within an IIFE are scoped to the function, preventing conflicts with variables in other scopes.

4. **Syntax:**

   - The function is enclosed in parentheses to create a function expression, followed by another set of parentheses to invoke the function immediately.

**Example of IIFE:**

```javascript
(function () {
  const message = 'Hello, IIFE!';
  console.log(message);
})();

// Output: "Hello, IIFE!"
```

#### **Use Cases for IIFE:**

1. **Avoiding Global Namespace Pollution:**

   - IIFEs help prevent variable conflicts by encapsulating variables within a local scope.

   **Example:**

   ```javascript
   (function () {
     const localVar = 'I am local';
     console.log(localVar);
   })();

   // console.log(localVar); // Error: localVar is not defined
   ```

2. **Module Pattern:**

   - IIFEs can be used to implement the module pattern, creating private and public members.

   **Example:**

   ```javascript
   const myModule = (function () {
     const privateVar = 'Private';

     function privateFunction()

 {
       return 'I am private';
     }

     return {
       publicVar: 'Public',
       publicFunction: function () {
         return `Accessing: ${privateVar} and ${privateFunction()}`;
       },
     };
   })();

   console.log(myModule.publicVar); // Output: "Public"
   console.log(myModule.publicFunction()); // Output: "Accessing: Private and I am private"
   ```

3. **Initial Setup:**

   - IIFEs are often used for initialization tasks that need to run immediately, such as setting up event listeners or configuring application settings.

   **Example:**

   ```javascript
   (function () {
     document.addEventListener('DOMContentLoaded', () => {
       console.log('DOM is fully loaded');
     });
   })();
   ```

4. **Preventing `var` Hoisting Issues:**

   - IIFEs can be used to avoid issues related to `var` hoisting by creating a local scope for variables.

   **Example:**

   ```javascript
   for (var i = 0; i < 3; i++) {
     (function (currentValue) {
       setTimeout(() => {
         console.log(currentValue);
       }, 1000);
     })(i);
   }
   ```

   **Output:**

   ```
   0
   1
   2
   ```

#### **How Would You Write One?**

To write an IIFE, follow these steps:

1. **Define the Function:**

   - Write the function as a function expression, enclosing it in parentheses.

2. **Invoke the Function:**

   - Immediately invoke the function by adding parentheses after the function expression.

**Syntax:**

```javascript
(function () {
  // Function body
})();
```

**Example:**

```javascript
(function () {
  console.log('This is an IIFE');
})();

// Output: "This is an IIFE"
```

**Conclusion:**

- IIFEs are a powerful tool for creating isolated scopes, preventing variable conflicts, and executing code immediately. They are widely used in modern JavaScript development for encapsulation and modularization.

Here's an overview of the topics and questions you've asked about JavaScript (ES6+), DOM Manipulation, Asynchronous Web, and TypeScript. I've provided detailed explanations and examples for each question.

## ES6+

### Basic

---

#### What standard is JS based off of?

JavaScript is based on the ECMAScript (ES) standard, which is a scripting language specification standardized by ECMA International. ECMAScript provides the foundation for JavaScript and defines the syntax, semantics, and features of the language.

- **Versions:** ES6 (ECMAScript 2015) introduced major improvements, including arrow functions, let/const, template literals, and more.
- **Updates:** ECMAScript is regularly updated, with new versions released annually (e.g., ES2016, ES2017).

---

#### What is the difference between `var`, `let`, and `const` keywords?

The keywords `var`, `let`, and `const` are used to declare variables in JavaScript, but they have different scoping rules and behaviors:

1. **`var`:**
   - **Scope:** Function-scoped or globally-scoped, depending on where it's declared.
   - **Hoisting:** Variables declared with `var` are hoisted to the top of their scope but are initialized with `undefined`.
   - **Reassignment:** Can be reassigned and re-declared within the same scope.
   
   ```javascript
   function example() {
       console.log(x); // undefined (hoisted)
       var x = 10;
       console.log(x); // 10
   }
   ```

2. **`let`:**
   - **Scope:** Block-scoped, meaning it is only accessible within the block (e.g., `{}`) where it's declared.
   - **Hoisting:** Variables declared with `let` are hoisted but not initialized, leading to a "temporal dead zone" until they are defined.
   - **Reassignment:** Can be reassigned but not re-declared within the same scope.
   
   ```javascript
   function example() {
       // console.log(y); // ReferenceError: Cannot access 'y' before initialization
       let y = 20;
       console.log(y); // 20
   }
   ```

3. **`const`:**
   - **Scope:** Block-scoped like `let`.
   - **Hoisting:** Similar behavior to `let` with hoisting and the "temporal dead zone."
   - **Reassignment:** Cannot be reassigned or re-declared. The variable must be initialized at the time of declaration.
   - **Note:** `const` does not make objects immutable; it only prevents reassignment of the reference.
   
   ```javascript
   const z = 30;
   // z = 40; // TypeError: Assignment to constant variable
   const obj = { name: "Alice" };
   obj.name = "Bob"; // Allowed
   ```

---

#### How would we rewrite this code with a template literal?

**Original Code:**

```javascript
let n = 'Dorian';
let message = 'My name is ' + n;
console.log(message);
```

**Rewritten with Template Literal:**

Template literals allow embedding expressions within strings using backticks (\`` `) and `${}` for placeholders.

```javascript
let n = 'Dorian';
let message = `My name is ${n}`;
console.log(message);
```

Template literals offer several benefits:
- **Multi-line Strings:** Support multi-line strings without needing escape sequences.
- **Expression Interpolation:** Easily embed variables and expressions.
- **Enhanced Readability:** Improve readability and maintainability of complex strings.

---

### Intermediate

---

#### What’s the difference between a normal function declaration and an arrow function?

**Normal Function Declaration:**

```javascript
function add(a, b) {
    return a + b;
}
```

**Arrow Function:**

```javascript
const add = (a, b) => {
    return a + b;
};
```

**Key Differences:**

1. **Syntax:**
   - **Arrow functions** have a concise syntax using `=>`.
   - **Function declarations** require the `function` keyword.

2. **`this` Binding:**
   - **Arrow functions** do not have their own `this` context. They inherit `this` from the surrounding scope (lexical scoping).
   - **Function declarations** have their own `this` context.

   ```javascript
   const obj = {
       value: 10,
       arrowFunc: () => {
           console.log(this.value); // undefined (inherited from global scope)
       },
       normalFunc: function() {
           console.log(this.value); // 10 (refers to obj's value)
       }
   };
   obj.arrowFunc();
   obj.normalFunc();
   ```

3. **`arguments` Object:**
   - **Arrow functions** do not have their own `arguments` object.
   - **Function declarations** have an `arguments` object that contains the function's arguments.

   ```javascript
   const arrowFunc = () => {
       console.log(arguments); // ReferenceError: arguments is not defined
   };
   function normalFunc() {
       console.log(arguments); // [Arguments] { '0': 1, '1': 2 }
   }
   normalFunc(1, 2);
   ```

4. **Use Cases:**
   - **Arrow functions** are often used for concise callbacks, especially in functional programming.
   - **Function declarations** are preferred when `this` context or arguments are needed.

---

#### How would you set default values for parameters to a function?

You can set default values for function parameters in ES6+ using the syntax `parameter = defaultValue`.

**Example:**

```javascript
function greet(name = "Guest") {
    console.log(`Hello, ${name}!`);
}

greet(); // Output: Hello, Guest!
greet("Alice"); // Output: Hello, Alice!
```

**Arrow Function with Default Parameters:**

```javascript
const greet = (name = "Guest") => {
    console.log(`Hello, ${name}!`);
};

greet(); // Output: Hello, Guest!
greet("Alice"); // Output: Hello, Alice!
```

**Benefits of Default Parameters:**

- **Simplify Code:** Reduces the need for conditional checks for undefined parameters.
- **Flexibility:** Allows functions to be more flexible by handling missing arguments gracefully.

---

#### Explain the `async/await` keywords. Why is it preferred to use this instead of `.then()` methods?

**`async`/`await`:**

- **`async` Functions:** A function declared with `async` returns a Promise. It can contain `await` expressions to pause execution until a Promise is resolved.

  ```javascript
  async function fetchData() {
      const response = await fetch('https://api.example.com/data');
      const data = await response.json();
      return data;
  }
  ```

- **`await` Keyword:** Pauses the execution of an `async` function until the Promise is resolved. It can only be used inside `async` functions.

**Why Prefer `async/await` over `.then()`:**

1. **Readability:** `async/await` provides a more readable and synchronous-like code structure compared to nested `.then()` chains.

   **Example with `.then()`:**

   ```javascript
   fetch('https://api.example.com/data')
       .then(response => response.json())
       .then(data => {
           console.log(data);
       })
       .catch(error => {
           console.error(error);
       });
   ```

   **Example with `async/await`:**

   ```javascript
   async function fetchData() {
       try {
           const response = await fetch('https://api.example.com/data');
           const data = await response.json();
           console.log(data);
       } catch (error) {
           console.error(error);
       }
   }
   ```

2. **Error Handling:** `async/await` uses try-catch blocks for error handling, making it easier to manage errors in complex asynchronous code.

3. **Debugging:** Debugging `async/await` code is often simpler because the stack trace more accurately reflects the logical flow of the program.

4. **Maintainability:** Asynchronous code with `async/await` is more maintainable, especially in larger projects, due to its linear structure.

**Note:** Despite its advantages, `async/await` is syntactic sugar over Promises and doesn't replace the need for Promises. Understanding Promises is crucial for mastering `async/await`.

---

#### How do you interact with a Promise? When would it be appropriate to use a Promise?

**Interacting with a Promise:**

1. **Creating a Promise:**

   ```javascript
   const myPromise = new Promise((resolve, reject) => {
       // Asynchronous operation
       if (operationSuccess) {
           resolve(result);
       } else {
           reject(error);
       }
   });
   ```

2. **Using `.then()` and `.catch()`:**

   ```javascript
   myPromise
       .then(result => {
           console.log('Success:', result);
       })
       .catch(error => {
           console.error('Error:', error);
       });
   ```

3. **Using `async/await`:**

   ```javascript
   async function handlePromise() {
       try {
           const result = await myPromise;
           console.log('Success:', result);
       } catch (error) {
           console.error('Error:', error);
       }
   }
   ```

**When to Use Promises:**

1. **Asynchronous Operations:** Use Promises for operations that may take time, such as network requests, file I/O, or database queries.

2. **Chained Operations:** Promises allow chaining multiple asynchronous operations,

 ensuring they execute in order.

3. **Handling Errors:** Promises provide a clean way to handle errors, allowing the use of `.catch()` to handle failures.

4. **Improving Readability:** Promises help improve the readability of asynchronous code by avoiding deeply nested callbacks (callback hell).

**Example Use Case:**

```javascript
function fetchData() {
    return new Promise((resolve, reject) => {
        fetch('https://api.example.com/data')
            .then(response => response.json())
            .then(data => resolve(data))
            .catch(error => reject(error));
    });
}

fetchData()
    .then(data => {
        console.log('Data:', data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
```

---

## DOM Manipulation

### Basic

---

#### Explain the following code:

```javascript
document.getElementById("myid").addEventListener('click', (e) => {
  e.stopPropagation();
});
```

**Explanation:**

1. **`document.getElementById("myid")`:** This selects the HTML element with the ID `myid`.

2. **`addEventListener('click', (e) => {...})`:** Attaches an event listener to the element that listens for a `click` event. When the element is clicked, the specified callback function is executed.

3. **`e.stopPropagation()`:** Prevents the event from bubbling up to parent elements. This means that the click event will not trigger any click event listeners on ancestor elements.

**Use Case:**

- **Event Propagation Control:** Useful when you want to handle an event exclusively on a specific element without affecting its parent elements. For example, stopping a modal dialog from closing when clicking inside it.

**Example:**

```html
<div id="parent">
    <button id="myid">Click Me</button>
</div>
```

```javascript
document.getElementById("parent").addEventListener('click', () => {
    console.log('Parent clicked');
});

document.getElementById("myid").addEventListener('click', (e) => {
    e.stopPropagation();
    console.log('Button clicked');
});
```

- **Without `e.stopPropagation()`:** Clicking the button logs "Button clicked" and "Parent clicked."
- **With `e.stopPropagation()`:** Clicking the button logs only "Button clicked."

---

#### What is the global object in client-side JavaScript? What are some built-in functions on this object?

**Global Object in Client-Side JavaScript:**

- In client-side JavaScript, the global object is `window`.
- The `window` object represents the browser's window and provides access to the DOM, browser history, location, and more.

**Built-In Functions on the Global Object:**

1. **`alert(message)`:** Displays an alert dialog with the specified message.

   ```javascript
   alert("Hello, World!");
   ```

2. **`console.log(message)`:** Logs a message to the browser console.

   ```javascript
   console.log("Debugging message");
   ```

3. **`setTimeout(function, delay)`:** Executes a function after a specified delay (in milliseconds).

   ```javascript
   setTimeout(() => {
       console.log("Executed after 2 seconds");
   }, 2000);
   ```

4. **`setInterval(function, interval)`:** Repeatedly executes a function at specified intervals (in milliseconds).

   ```javascript
   setInterval(() => {
       console.log("Executed every 1 second");
   }, 1000);
   ```

5. **`parseInt(string, radix)`:** Parses a string and returns an integer of the specified radix.

   ```javascript
   const number = parseInt("42", 10);
   ```

6. **`encodeURIComponent(str)`:** Encodes a URI component by replacing special characters.

   ```javascript
   const encoded = encodeURIComponent("Hello, World!");
   ```

7. **`decodeURIComponent(str)`:** Decodes a URI component.

   ```javascript
   const decoded = decodeURIComponent(encoded);
   ```

**Note:** These functions are accessible globally and do not require the `window` prefix (e.g., `window.alert`).

---

#### What is the DOM? How is it represented as a data structure? What object in a browser environment allows us to interact with the DOM?

**Document Object Model (DOM):**

- The DOM is a programming interface that represents the structure of an HTML or XML document.
- It provides a tree-like structure where each element, attribute, and text in the document is represented as a node.

**DOM as a Data Structure:**

- **Tree Structure:** The DOM is organized as a tree, with a root node (the document itself) and child nodes (elements, attributes, text).
- **Node Types:**
  - **Element Nodes:** Represent HTML elements (e.g., `<div>`, `<p>`).
  - **Text Nodes:** Represent text content within elements.
  - **Attribute Nodes:** Represent attributes of elements (e.g., `id`, `class`).

**Interacting with the DOM:**

- **`document` Object:** The `document` object in a browser environment allows us to interact with the DOM.
- **Methods and Properties:**
  - **`document.getElementById(id)`:** Selects an element by its ID.
  - **`document.querySelector(selector)`:** Selects the first element that matches the CSS selector.
  - **`document.createElement(tagName)`:** Creates a new element.
  - **`document.body`:** Represents the `<body>` element of the document.

**Example:**

```html
<!DOCTYPE html>
<html>
<head>
    <title>DOM Example</title>
</head>
<body>
    <div id="container">
        <p>Hello, World!</p>
    </div>
    <script>
        const container = document.getElementById('container');
        console.log(container.innerHTML); // Outputs: <p>Hello, World!</p>
    </script>
</body>
</html>
```

---

#### List some ways of querying the DOM for elements

There are several methods to query the DOM for elements:

1. **`document.getElementById(id)`:** Selects an element by its ID.

   ```javascript
   const element = document.getElementById('myId');
   ```

2. **`document.getElementsByClassName(className)`:** Selects elements by their class name. Returns a live HTMLCollection.

   ```javascript
   const elements = document.getElementsByClassName('myClass');
   ```

3. **`document.getElementsByTagName(tagName)`:** Selects elements by their tag name. Returns a live HTMLCollection.

   ```javascript
   const paragraphs = document.getElementsByTagName('p');
   ```

4. **`document.querySelector(selector)`:** Selects the first element that matches the CSS selector.

   ```javascript
   const element = document.querySelector('.myClass');
   ```

5. **`document.querySelectorAll(selector)`:** Selects all elements that match the CSS selector. Returns a static NodeList.

   ```javascript
   const elements = document.querySelectorAll('div.myClass');
   ```

6. **`document.forms[index]`:** Selects a form element by its index in the document.

   ```javascript
   const form = document.forms[0];
   ```

7. **`document.links`:** Selects all `<a>` elements with an `href` attribute in the document.

   ```javascript
   const links = document.links;
   ```

8. **`document.images`:** Selects all `<img>` elements in the document.

   ```javascript
   const images = document.images;
   ```

9. **`document.anchors`:** Selects all `<a>` elements with a `name` attribute in the document.

   ```javascript
   const anchors = document.anchors;
   ```

**Note:** Modern JavaScript often uses `querySelector` and `querySelectorAll` due to their flexibility and support for complex CSS selectors.

---

#### How would you insert a new element into the DOM?

You can insert a new element into the DOM using various methods provided by the DOM API:

1. **`createElement()`:** Create the new element.

2. **`appendChild()`:** Append the new element as a child of an existing element.

3. **`insertBefore()`:** Insert the new element before a specific child of an existing element.

4. **`innerHTML`:** Use to add HTML content directly (less preferred due to performance and security concerns).

**Example:**

```html
<!DOCTYPE html>
<html>
<head>
    <title>Insert Element Example</title>
</head>
<body>
    <div id="container">
        <p>First Paragraph</p>
    </div>
    <script>
        // Create a new element
        const newParagraph = document.createElement('p');
        newParagraph.textContent = 'Second Paragraph';

        // Append the new element to the container
        const container = document.getElementById('container');
        container.appendChild(newParagraph);

        // Insert a new element before the first paragraph
        const firstParagraph = container.querySelector('p');
        const anotherParagraph = document.createElement('p');
        anotherParagraph.textContent = 'Inserted Before First Paragraph';
        container.insertBefore(anotherParagraph, firstParagraph);
    </script>
</body>
</html>
```

**Output:**

```html
<div id="container">
    <p>Inserted Before First Paragraph</p>
    <p>First Paragraph</p>
    <p>Second Paragraph</

p>
</div>
```

**Methods Overview:**

- **`createElement(tagName)`:** Creates a new element node with the specified tag name.
- **`appendChild(newNode)`:** Appends a new child node to the end of the parent node's list of children.
- **`insertBefore(newNode, referenceNode)`:** Inserts the new node before the reference node as a child of the specified parent.
- **`innerHTML`:** Directly sets the HTML content of an element.

**Note:** When using `innerHTML`, be cautious of potential security risks like Cross-Site Scripting (XSS) attacks.

---

#### What are event listeners? What are some events we can listen for? What are some different ways of setting event listeners?

**Event Listeners:**

- Event listeners are functions that are triggered in response to specific events occurring on DOM elements.
- They enable interactive behavior by responding to user actions like clicks, keyboard input, and more.

**Common Events:**

1. **Mouse Events:**
   - **`click`:** Triggered when an element is clicked.
   - **`dblclick`:** Triggered on a double-click.
   - **`mouseover`:** Triggered when the mouse hovers over an element.
   - **`mouseout`:** Triggered when the mouse leaves an element.
   - **`mousedown`:** Triggered when the mouse button is pressed.
   - **`mouseup`:** Triggered when the mouse button is released.

2. **Keyboard Events:**
   - **`keydown`:** Triggered when a key is pressed.
   - **`keyup`:** Triggered when a key is released.
   - **`keypress`:** Triggered when a key is pressed and released (deprecated).

3. **Form Events:**
   - **`submit`:** Triggered when a form is submitted.
   - **`change`:** Triggered when the value of an input changes.
   - **`focus`:** Triggered when an element gains focus.
   - **`blur`:** Triggered when an element loses focus.

4. **Window Events:**
   - **`load`:** Triggered when the page is fully loaded.
   - **`resize`:** Triggered when the window is resized.
   - **`scroll`:** Triggered when the window is scrolled.

5. **Touch Events (Mobile):**
   - **`touchstart`:** Triggered when a touch point is placed on the touch surface.
   - **`touchmove`:** Triggered when a touch point is moved along the touch surface.
   - **`touchend`:** Triggered when a touch point is removed from the touch surface.

**Setting Event Listeners:**

1. **Using `addEventListener()`:**

   ```javascript
   const button = document.getElementById('myButton');
   button.addEventListener('click', () => {
       console.log('Button clicked!');
   });
   ```

   - **Benefits:** Allows multiple listeners for the same event, provides options for event capturing/bubbling, and supports event removal.

2. **Inline HTML Attributes (Deprecated):**

   ```html
   <button id="myButton" onclick="alert('Button clicked!')">Click Me</button>
   ```

   - **Drawbacks:** Less separation of concerns, harder to maintain, and less flexible.

3. **Using DOM Properties:**

   ```javascript
   const button = document.getElementById('myButton');
   button.onclick = () => {
       console.log('Button clicked!');
   };
   ```

   - **Drawbacks:** Only one listener per event type, overrides previous assignments.

4. **Event Delegation (Efficient Handling):**

   - Use a single listener on a parent element to manage events for multiple child elements.

   ```javascript
   const list = document.getElementById('myList');
   list.addEventListener('click', (e) => {
       if (e.target.tagName === 'LI') {
           console.log(`List item ${e.target.textContent} clicked!`);
       }
   });
   ```

**Event Listener Options:**

- **Capture/Bubble Phase:** Specify whether the listener should act in the capture or bubble phase.

  ```javascript
  element.addEventListener('click', handler, { capture: true });
  ```

- **Once:** Ensure the listener executes only once and is removed afterward.

  ```javascript
  element.addEventListener('click', handler, { once: true });
  ```

- **Passive:** Indicate that the listener will not call `preventDefault()` (improves performance for scroll events).

  ```javascript
  element.addEventListener('scroll', handler, { passive: true });
  ```

**Note:** `addEventListener()` is the preferred method due to its flexibility and adherence to modern JavaScript best practices.

---

#### What is bubbling and capturing and what is the difference?

**Event Propagation:**

Event propagation defines how events travel through the DOM tree. There are two main phases: capturing and bubbling.

1. **Capturing Phase (Trickling):**
   - Events travel from the root (document) down to the target element.
   - **Capture Phase:** The event moves through ancestor elements before reaching the target.

2. **Bubbling Phase:**
   - Events travel from the target element back up to the root (document).
   - **Bubble Phase:** The event moves through ancestor elements after reaching the target.

**Difference:**

- **Capturing:** The event is handled by parent elements first, then the target element.
- **Bubbling:** The event is handled by the target element first, then the parent elements.

**Example:**

Consider the following HTML structure:

```html
<div id="parent">
    <button id="child">Click Me</button>
</div>
```

**JavaScript:**

```javascript
document.getElementById('parent').addEventListener('click', () => {
    console.log('Parent clicked');
}, true); // Capturing phase

document.getElementById('child').addEventListener('click', () => {
    console.log('Child clicked');
}); // Bubbling phase
```

**Output on Click:**

1. **Capturing:** "Parent clicked" (captures first), "Child clicked" (bubbles later).
2. **Bubbling:** "Child clicked" (bubbles first), "Parent clicked" (captures later).

**Event Propagation Control:**

- **`stopPropagation()`:** Stops the event from propagating further in either phase.
- **`stopImmediatePropagation()`:** Stops the event from propagating and prevents any other listeners on the current target.

**Use Cases:**

- **Capturing:** Useful for actions that need to occur before child elements handle the event (e.g., intercepting form submissions).
- **Bubbling:** Commonly used for event delegation, allowing parent elements to manage child elements' events.

**Best Practice:**

- Use bubbling for most cases unless specific use cases require capturing.
- Handle events on parent elements for efficiency and simplicity.

---

#### What are some methods on the event object and what do they do?

The event object provides information about an event and methods to control its behavior.

**Common Event Methods:**

1. **`stopPropagation()`:**
   - Prevents the event from propagating further in the capturing and bubbling phases.

   ```javascript
   element.addEventListener('click', (e) => {
       e.stopPropagation();
   });
   ```

2. **`stopImmediatePropagation()`:**
   - Stops the event from propagating and prevents any remaining listeners on the current target from executing.

   ```javascript
   element.addEventListener('click', (e) => {
       e.stopImmediatePropagation();
   });
   ```

3. **`preventDefault()`:**
   - Prevents the default action associated with the event (e.g., link navigation, form submission).

   ```javascript
   element.addEventListener('submit', (e) => {
       e.preventDefault();
   });
   ```

4. **`initEvent()`:** (Deprecated)
   - Initializes the value of an event created using `document.createEvent()`. Deprecated in favor of `Event` constructors.

   ```javascript
   const event = document.createEvent('Event');
   event.initEvent('click', true, true);
   ```

5. **`dispatchEvent()`:**
   - Dispatches an event to the target element, simulating the event's occurrence.

   ```javascript
   const event = new Event('click');
   element.dispatchEvent(event);
   ```

6. **`preventDefault()`:**
   - Prevents the default behavior associated with the event, such as navigating to a link or submitting a form.

   ```javascript
   element.addEventListener('click', (e) => {
       e.preventDefault(); // Prevents default link behavior
   });
   ```

**Common Event Properties:**

1. **`target`:**
   - Refers to the element that triggered the event.

   ```javascript
   element.addEventListener('click', (e) => {
       console.log(e.target); // Element that triggered the click event
   });
   ```

2. **`currentTarget`:**
   - Refers to the element on which the event listener is currently executing.

   ```javascript
   element.addEventListener('click', (e) => {
       console.log(e.currentTarget); // Element with the click listener
   });
   ```

3. **`type`:**
   - The type of event that occurred (e.g., `'click'`, `'submit'`).

   ```javascript
   element.addEventListener('click', (e) => {
       console.log(e.type); // 'click'
   });
   ```

4. **`bubbles`:**
   - Indicates whether the event bubbles up through the DOM.

   ```javascript
   element.addEventListener('click', (e) => {
       console.log(e.bubbles); // true for bubbling events
   });
   ```

5. **`defaultPrevented`:**
   - Indicates whether the event's default action has been prevented.

   ```javascript
   element.addEventListener('click', (e) => {
       e.preventDefault();
       console.log(e.defaultPrevented); // true
   });
   ```

6. **`eventPhase`:**
   - Indicates the phase of event propagation: 1 (capturing), 2 (target), 3 (bubbling).

   ```javascript
   element.addEventListener('click', (e) => {
       console.log(e.eventPhase); // Phase of the event
   });
   ```

**Example Usage:**

```html
<button id="myButton">Click Me</button>
<script>
    const button = document.getElementById('myButton');
    button.addEventListener('click', (e) => {
        e.preventDefault(); // Prevent default behavior
        e.stopPropagation(); // Stop event propagation
        console.log(e.target); // Button element
        console.log(e.currentTarget); // Button element
        console.log(e.type); // 'click'
    });
</script>
```

**Use Cases:**

- **Custom Event Handling:** Modify or control event behavior for specific needs.
- **Debugging and Logging:** Analyze event properties and behavior during development.
- **Interactivity and User Experience:** Create interactive and dynamic web applications.

---

## Asynchronous Web

### Basic

---

#### What is the Fetch API?

The Fetch API is a modern web API for making HTTP requests in web applications. It provides an easy-to-use and flexible interface for interacting with network resources, replacing the older XMLHttpRequest (XHR) API.

**Key Features:**

1. **Promise-Based:** Fetch returns Promises, making it easier to work with asynchronous operations.

2. **Readable Stream:** Supports streaming response bodies, allowing progressive data processing.

3. **Flexibility:** Offers fine-grained control over request and response handling with methods like `Request`, `Response`, `Headers`, and `Body`.

4. **CORS Support:** Automatically handles Cross-Origin Resource Sharing (CORS) requests.

5. **Method Options:** Supports common HTTP methods like GET, POST, PUT, DELETE, and more.

**Basic Usage:**

```javascript
fetch(url, options)
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
```

**Note:** Fetch doesn't automatically reject on HTTP error status (e.g., 404, 500); you must check the response status manually.

---

#### How do you send a Fetch request?

To send a Fetch request, use the `fetch()` function with a URL and an optional options object.

**Basic Fetch Request:**

1. **GET Request:**

   ```javascript
   fetch('https://api.example.com/data')
       .then(response => response.json())
       .then(data => {
           console.log(data);
       })
       .catch(error => {
           console.error('Error:', error);
       });
   ```

2. **POST Request:**

   ```javascript
   fetch('https://api.example.com/submit', {
       method: 'POST',
       headers: {
           'Content-Type': 'application/json'
       },
       body: JSON.stringify({
           name: 'John Doe',
           email: 'john@example.com'
       })
   })
   .then(response => response.json())
   .then(data => {
       console.log('Success:', data);
   })
   .catch(error => {
       console.error('Error:', error);
   });
   ```

**Options Object:**

- **`method`:** HTTP method (GET, POST, PUT, DELETE, etc.).
- **`headers`:** HTTP headers as an object.
- **`body`:** Request body (stringified JSON, FormData, etc.).
- **`mode`:** CORS mode (`cors`, `no-cors`, `same-origin`).
- **`credentials`:** Credentials mode (`omit`, `same-origin`, `include`).
- **`cache`:** Cache mode (`default`, `no-store`, `reload`, etc.).

**Example:**

```javascript
const url = 'https://api.example.com/data';
const options = {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify({ key: 'value' })
};

fetch(url, options)
    .then(response => response.json())
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
```

**Note:** For non-GET requests, ensure the `Content-Type` header matches the request body format.

---

#### How would you retrieve JSON data from a Fetch request?

To retrieve JSON data from a Fetch request, use the `json()` method on the `Response` object returned by `fetch()`.

**Steps:**

1. **Make the Fetch Request:**

   ```javascript
   fetch('https://api.example.com/data')
       .then(response => {
           // Check if response is OK (status in the range 200-299)
           if (!response.ok) {
               throw new Error(`HTTP error! Status: ${response.status}`);
           }
           return response.json(); // Parse JSON data
       })
       .then(data => {
           console.log(data); // Process JSON data
       })
       .catch(error => {
           console.error('Error:', error);
       });
   ```

2. **Using `async/await`:**

   ```javascript
   async function fetchData() {
       try {
           const response = await fetch('https://api.example.com/data');
           if (!response.ok) {
               throw new Error(`HTTP error! Status: ${response.status}`);
           }
           const data = await response.json();
           console.log(data);
       } catch (error) {
           console.error('Error:', error);
       }
   }

   fetchData();
   ```

**Handling Response:**

- **Check Response Status:** Use `response.ok` to verify successful response.
- **Parse JSON:** Use `response.json()` to parse the JSON body.

**Example API Response:**

```json
{
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com"
}
```

**Handling Large Data:**

- **Readable Streams:** Fetch supports handling large JSON data efficiently using readable streams.

```javascript
fetch('https://api.example.com/large-data')
    .then(response => {
        const reader = response.body.getReader();
        const decoder = new TextDecoder('utf-8');
        return reader.read().then(function process({ done, value }) {
            if (done) {
                return;
            }
            const text = decoder.decode(value, { stream: true });
            console.log(text); // Process chunk of JSON data
            return reader.read().then(process);
        });
    })
    .catch(error => {
        console.error('Error:', error);
    });
```

**Note:** Ensure the server response is in JSON format for successful parsing.

---

#### How do you handle a failed request in Fetch?

Handling a failed request in Fetch involves checking the response status and handling exceptions.

**Steps:**

1. **Check Response Status:**

   ```javascript
   fetch('https://api.example.com/data')
       .then(response => {
           if (!response.ok) {
               throw new Error(`HTTP error! Status: ${response.status}`);
           }
           return response.json();
       })
       .then(data => {
           console.log(data);
       })
       .catch(error => {
           console.error('Error:', error);
       });
   ```

2. **Using `async/await` and Try-Catch:**

   ```javascript
   async function fetchData() {
       try {
           const response = await fetch('https://api.example.com/data');
           if (!response.ok) {
               throw new Error(`HTTP error! Status: ${response.status}`);
           }
           const data = await response.json();
           console.log(data);
       } catch (error) {
           console.error('Error:', error);
       }
   }

   fetchData();
   ```

**Error Handling Techniques:**

1. **Network Errors:** Use `catch()` to handle network errors (e.g., connection issues).

   ```javascript
   fetch('https://api.example.com/data')
       .catch(error => {
           console.error('Network Error:', error);
       });
   ```

2. **HTTP Status Check:** Verify `response.ok` or `response.status` for non-200 status codes.

   ```javascript
   fetch('https://api.example.com/data')
       .then(response => {
           if (!response.ok) {
               throw new Error(`HTTP error! Status: ${response.status}`);
           }
           return response.json();
       })
       .catch(error => {
           console.error('HTTP Error:', error);
       });
   ```

3. **Retry Logic:** Implement retry logic for transient errors using exponential backoff.

   ```javascript
   async function fetchWithRetry(url, retries = 3) {
       try {
           const response = await fetch(url);
           if (!response.ok) {
               throw new Error(`HTTP error! Status: ${response.status}`);
           }
           return await response.json();
       } catch (error) {
           if (retries > 0) {
               console.log('Retrying...', retries);
               await new Promise(resolve => setTimeout(resolve, 1000)); // Delay
               return fetchWithRetry(url, retries - 1);
           }


           throw error;
       }
   }

   fetchWithRetry('https://api.example.com/data')
       .then(data => console.log(data))
       .catch(error => console.error('Final Error:', error));
   ```

4. **Custom Error Messages:** Provide user-friendly error messages for different scenarios.

   ```javascript
   fetch('https://api.example.com/data')
       .then(response => {
           if (!response.ok) {
               switch (response.status) {
                   case 404:
                       throw new Error('Resource not found');
                   case 500:
                       throw new Error('Server error');
                   default:
                       throw new Error('An unexpected error occurred');
               }
           }
           return response.json();
       })
       .catch(error => {
           console.error('Error:', error.message);
       });
   ```

**Note:** Fetch won't reject on HTTP error statuses like 404 or 500; you must check `response.ok` or `response.status`.

---

## TypeScript

### Basic

---

#### What are the differences between TypeScript and JavaScript?

**TypeScript vs. JavaScript:**

1. **TypeScript:**
   - **Superset:** TypeScript is a superset of JavaScript, adding static typing and additional features.
   - **Static Typing:** Supports static typing, allowing you to define variable types, interfaces, and more.
   - **Compilation:** Requires compilation to JavaScript using the TypeScript compiler (`tsc`).
   - **Error Checking:** Provides compile-time error checking and improved code quality.
   - **Features:** Supports modern JavaScript features and additional TypeScript-specific features (e.g., interfaces, decorators).

2. **JavaScript:**
   - **Dynamic Typing:** Uses dynamic typing, where variable types are determined at runtime.
   - **Interpreted:** Executed directly by the browser or JavaScript engine without compilation.
   - **Flexibility:** Offers flexibility but may lead to runtime errors due to lack of type checking.
   - **Features:** Supports ECMAScript standards and modern features (e.g., ES6+).

**Example:**

**TypeScript:**

```typescript
function greet(name: string): string {
    return `Hello, ${name}!`;
}

const message: string = greet('Alice');
console.log(message);
```

**JavaScript:**

```javascript
function greet(name) {
    return `Hello, ${name}!`;
}

const message = greet('Alice');
console.log(message);
```

**Key Differences:**

- **Type Annotations:** TypeScript allows defining types for variables, function parameters, and return values.
- **Error Detection:** TypeScript catches errors at compile time, reducing runtime errors.
- **IDE Support:** Enhanced IDE support with autocompletion, refactoring, and error checking.
- **Community:** TypeScript has a growing community and is widely adopted in large projects.

**Use Cases for TypeScript:**

- **Large Projects:** TypeScript is ideal for large projects with complex codebases, where static typing improves maintainability.
- **Team Collaboration:** TypeScript enhances collaboration by providing clear type definitions and preventing type-related errors.
- **Modern Development:** TypeScript supports modern JavaScript features and integrates seamlessly with popular frameworks like React, Angular, and Vue.

**Conclusion:**

TypeScript offers significant benefits over JavaScript by providing static typing, error checking, and improved developer experience. It is especially valuable for large projects and teams seeking to enhance code quality and maintainability.

---

#### What are the data types in TypeScript?

TypeScript provides a variety of data types, both primitive and complex, that enhance code safety and expressiveness.

**Primitive Data Types:**

1. **`number`:** Represents numeric values, including integers and floating-point numbers.

   ```typescript
   const age: number = 25;
   const price: number = 9.99;
   ```

2. **`string`:** Represents text values.

   ```typescript
   const name: string = 'Alice';
   const message: string = `Hello, ${name}!`;
   ```

3. **`boolean`:** Represents true or false values.

   ```typescript
   const isActive: boolean = true;
   const isComplete: boolean = false;
   ```

4. **`null`:** Represents the absence of a value.

   ```typescript
   const emptyValue: null = null;
   ```

5. **`undefined`:** Represents an uninitialized or missing value.

   ```typescript
   let undefinedValue: undefined;
   ```

6. **`symbol`:** Represents unique identifiers.

   ```typescript
   const uniqueId: symbol = Symbol('id');
   ```

7. **`bigint`:** Represents large integers (introduced in TypeScript 3.2).

   ```typescript
   const largeNumber: bigint = BigInt(9007199254740991);
   ```

**Complex Data Types:**

1. **`array`:** Represents an ordered list of values.

   ```typescript
   const numbers: number[] = [1, 2, 3, 4, 5];
   const names: string[] = ['Alice', 'Bob', 'Charlie'];
   ```

2. **`tuple`:** Represents a fixed-length array with specific types for each element.

   ```typescript
   const person: [string, number] = ['Alice', 25];
   ```

3. **`object`:** Represents an object with key-value pairs.

   ```typescript
   const user: { name: string; age: number } = { name: 'Alice', age: 25 };
   ```

4. **`enum`:** Represents a set of named constants.

   ```typescript
   enum Color {
       Red,
       Green,
       Blue
   }
   const favoriteColor: Color = Color.Red;
   ```

5. **`any`:** Represents any data type, allowing dynamic typing (use with caution).

   ```typescript
   let dynamicValue: any = 'Hello';
   dynamicValue = 42;
   ```

6. **`unknown`:** Represents a value with an unknown type, safer than `any`.

   ```typescript
   let unknownValue: unknown = 'Hello';
   ```

7. **`void`:** Represents the absence of a return value (used for functions).

   ```typescript
   function logMessage(message: string): void {
       console.log(message);
   }
   ```

8. **`never`:** Represents a value that never occurs (e.g., function never returns).

   ```typescript
   function throwError(message: string): never {
       throw new Error(message);
   }
   ```

9. **`Function`:** Represents a function type.

   ```typescript
   const greet: (name: string) => string = (name) => `Hello, ${name}!`;
   ```

**Type Inference:**

- TypeScript can infer types based on the assigned value, reducing the need for explicit type annotations.

  ```typescript
  let inferredNumber = 42; // Inferred as number
  let inferredString = 'Hello'; // Inferred as string
  ```

**Type Aliases:**

- Define custom types using type aliases for better code organization.

  ```typescript
  type User = { name: string; age: number };
  const user: User = { name: 'Alice', age: 25 };
  ```

**Conclusion:**

TypeScript's rich type system enhances code safety, maintainability, and readability. By leveraging static typing, developers can catch errors early and build more robust applications.

---

#### What data type allows a TypeScript variable to act like a JavaScript variable?

The `any` data type in TypeScript allows a variable to act like a JavaScript variable, accepting any data type without type checking. It provides the flexibility of dynamic typing but sacrifices type safety.

**Usage of `any`:**

1. **Dynamic Values:** Use `any` for values with unknown or dynamic types at compile time.

   ```typescript
   let dynamicValue: any = 'Hello';
   dynamicValue = 42; // Allowed
   dynamicValue = { name: 'Alice' }; // Allowed
   ```

2. **Migration from JavaScript:** Use `any` when migrating JavaScript code to TypeScript to gradually introduce type safety.

3. **Third-Party Libraries:** Use `any` for interacting with third-party libraries without TypeScript type definitions.

**Example:**

```typescript
function processInput(input: any): void {
    console.log(input);
}

processInput('Hello');
processInput(42);
processInput({ name: 'Alice' });
```

**Drawbacks of `any`:**

- **Lack of Type Safety:** Disables compile-time type checking, leading to potential runtime errors.
- **Reduced Readability:** Reduces code readability and maintainability by obscuring data types.
- **Hidden Bugs:** Increases the risk of hidden bugs due to unchecked operations on values.

**Best Practices:**

- **Minimize Usage:** Use `any` sparingly and prefer specific types for better code quality.
- **Gradual Typing:** Gradually replace `any` with specific types during refactoring.
- **`unknown` Type:** Prefer the `unknown` type over `any` for better type safety, requiring type checks before usage.

  ```typescript
  let unknownValue: unknown = 'Hello';
  if (typeof unknownValue === 'string') {
      console.log(unknownValue.toUpperCase());
  }
  ```

**Conclusion:**

While `any` provides flexibility, it's important to use it judiciously and embrace TypeScript's type system to enhance code safety, readability, and maintainability.

---

#### What are Enums? What are the different types?

Enums (Enumerations) in TypeScript are a way to define a set of named constants. They provide a way to organize and manage related values

, making code more readable and maintainable.

**Types of Enums:**

1. **Numeric Enums:**
   - Default enum type with auto-incrementing numeric values.
   - Values start at 0 and increment by 1 unless explicitly specified.

   ```typescript
   enum Direction {
       Up,    // 0
       Down,  // 1
       Left,  // 2
       Right  // 3
   }
   ```

   - **Custom Values:**

   ```typescript
   enum Status {
       Success = 1,
       Error = 2,
       Pending = 3
   }
   ```

2. **String Enums:**
   - Enums with string values, providing more meaningful and readable constants.

   ```typescript
   enum Color {
       Red = 'RED',
       Green = 'GREEN',
       Blue = 'BLUE'
   }
   ```

3. **Heterogeneous Enums:**
   - Mix of numeric and string values (less common, used sparingly).

   ```typescript
   enum Mixed {
       No = 0,
       Yes = 'YES'
   }
   ```

**Enum Usage:**

- **Access Enum Values:**

  ```typescript
  const direction: Direction = Direction.Up;
  console.log(direction); // 0
  ```

- **Reverse Mapping (Numeric Enums):**

  ```typescript
  console.log(Direction[0]); // 'Up'
  ```

- **String Enums:**

  ```typescript
  const color: Color = Color.Red;
  console.log(color); // 'RED'
  ```

**Use Cases:**

1. **Descriptive Constants:** Enums provide descriptive names for related constants, improving code readability.

   ```typescript
   enum HttpStatus {
       OK = 200,
       NotFound = 404,
       InternalServerError = 500
   }
   ```

2. **State Management:** Enums are useful for representing states or modes in an application.

   ```typescript
   enum GameState {
       Start,
       Playing,
       GameOver
   }
   ```

3. **Enum Flags:** Combine enum values using bitwise operations (numeric enums).

   ```typescript
   enum Permissions {
       Read = 1,    // 0001
       Write = 2,   // 0010
       Execute = 4  // 0100
   }
   const userPermissions = Permissions.Read | Permissions.Write;
   ```

**Limitations:**

- **String Enums:** Do not support reverse mapping like numeric enums.
- **Complexity:** Overuse of enums can lead to unnecessary complexity in code.

**Best Practices:**

- **Use Meaningful Names:** Use descriptive names for enum values to convey their purpose.
- **Use Enums Sparingly:** Use enums for related constants with shared context, not arbitrary values.
- **Avoid Heterogeneous Enums:** Use heterogeneous enums only when necessary for specific use cases.

**Conclusion:**

Enums provide a structured way to define related constants, improving code readability and maintainability. By choosing appropriate enum types, developers can create more organized and expressive code.

---

#### What are Union Types in TypeScript?

Union types in TypeScript allow a variable to hold values of multiple specified types. They enable more flexible type declarations while maintaining type safety.

**Syntax:**

```typescript
let variable: type1 | type2 | type3;
```

**Examples:**

1. **Basic Union Type:**

   ```typescript
   let value: string | number;
   value = 'Hello'; // Allowed
   value = 42;      // Allowed
   // value = true; // Error: Type 'boolean' is not assignable
   ```

2. **Union Type in Functions:**

   ```typescript
   function formatInput(input: string | number): string {
       return `Formatted: ${input}`;
   }

   console.log(formatInput('Hello')); // 'Formatted: Hello'
   console.log(formatInput(42));      // 'Formatted: 42'
   ```

3. **Complex Union Type:**

   ```typescript
   type User = { name: string; age: number };
   type Admin = { name: string; role: string };

   let person: User | Admin;
   person = { name: 'Alice', age: 25 };      // User
   person = { name: 'Bob', role: 'Admin' };  // Admin
   ```

**Use Cases:**

1. **Flexible Input Types:** Union types enable functions to accept multiple input types.

   ```typescript
   function processInput(input: string | number): void {
       if (typeof input === 'string') {
           console.log(`String: ${input}`);
       } else {
           console.log(`Number: ${input}`);
       }
   }
   ```

2. **Optional Properties:** Union types can represent optional properties in objects.

   ```typescript
   type Config = {
       width: number;
       height: number;
       color?: string | undefined; // Optional property
   };
   ```

3. **Discriminated Unions:** Union types with a common discriminator property for type narrowing.

   ```typescript
   type Shape =
       | { kind: 'circle'; radius: number }
       | { kind: 'rectangle'; width: number; height: number };

   function calculateArea(shape: Shape): number {
       if (shape.kind === 'circle') {
           return Math.PI * shape.radius ** 2;
       } else {
           return shape.width * shape.height;
       }
   }
   ```

**Benefits:**

- **Type Safety:** Union types ensure values adhere to one of the specified types, reducing errors.
- **Flexibility:** Allow handling of multiple scenarios within the same variable or function.
- **Improved Readability:** Enhance code readability by explicitly defining possible types.

**Limitations:**

- **Complexity:** Overuse of union types can lead to complex code that's harder to understand.
- **Type Narrowing Required:** Type guards or narrowing techniques are often needed to handle specific types.

**Best Practices:**

- **Use Descriptive Types:** Use meaningful type names for union components to improve readability.
- **Limit Union Size:** Avoid overly large unions to keep code manageable and understandable.
- **Combine with Type Guards:** Use type guards for runtime type checking and narrowing.

**Conclusion:**

Union types provide a powerful way to handle multiple types in TypeScript, enhancing code flexibility and safety. By using union types thoughtfully, developers can create more expressive and resilient code.

---

#### What is the difference between an Array and a Tuple in TypeScript?

**Array:**

- **Type Definition:** An array can hold multiple values of the same or different types.
- **Homogeneous or Heterogeneous:** Arrays can be homogeneous (all elements of the same type) or heterogeneous (elements of different types).
- **Dynamic Length:** Arrays can change in length, allowing elements to be added or removed.
- **Flexible Access:** Elements can be accessed using indices.

**Example:**

```typescript
const numbers: number[] = [1, 2, 3, 4, 5];
const mixed: (string | number)[] = ['Alice', 25, 'Bob', 30];
```

**Tuple:**

- **Type Definition:** A tuple is a fixed-length array with specified types for each element.
- **Fixed Length:** Tuples have a fixed length, and each element has a predefined type.
- **Structured Data:** Tuples are used for structured data with known types for each position.
- **Access by Position:** Elements are accessed by their position in the tuple.

**Example:**

```typescript
const person: [string, number] = ['Alice', 25];
const coordinates: [number, number, number] = [10, 20, 30];
```

**Key Differences:**

1. **Length and Type Constraints:**
   - **Array:** Flexible length and can hold elements of any type (homogeneous or heterogeneous).
   - **Tuple:** Fixed length with specific types for each position.

2. **Use Cases:**
   - **Array:** Used for collections of similar data types or lists with dynamic length.
   - **Tuple:** Used for structured data where the order and type of elements are fixed.

3. **Accessing Elements:**
   - **Array:** Access elements using indices, but type safety is less strict.
   - **Tuple:** Access elements by position with strict type checking.

4. **Example:**

   **Array:**

   ```typescript
   const fruits: string[] = ['Apple', 'Banana', 'Orange'];
   fruits.push('Grapes'); // Allowed
   ```

   **Tuple:**

   ```typescript
   const person: [string, number] = ['Alice', 25];
   // person.push('Engineer'); // Error: Property 'push' does not exist on type '[string, number]'
   ```

**Use Cases:**

- **Array:** Suitable for dynamic collections, lists, and iterations.
- **Tuple:** Ideal for fixed-size data structures like pairs, triples, or records with known types.

**Conclusion:**

Arrays and tuples serve different purposes in TypeScript, with arrays providing flexibility and tuples offering strict type safety for structured data. Understanding their differences helps developers choose the right data structure for their specific use case.

---

#### What are Utility Types in TypeScript? Give some examples.

Utility types in TypeScript are built-in types that provide transformations and operations on existing types. They help manipulate and create new types based on existing ones, enhancing code reusability and expressiveness.

**Common Utility Types:**

1. **`Partial<T>`:**
   - Makes all properties of a type `T` optional.

   ```typescript
   interface User {
       name: string;
       age: number;
       email: string
   ;}

   const partialUser: Partial<User> = {
       name: 'Alice'
   };
   ```

2. **`Required<T>`:**
   - Makes all properties of a type `T` required.

   ```typescript
   interface User {
       name?: string;
       age?: number;
       email?: string;
   }

   const requiredUser: Required<User> = {
       name: 'Alice',
       age: 25,
       email: 'alice@example.com'
   };
   ```

3. **`Readonly<T>`:**
   - Makes all properties of a type `T` read-only.

   ```typescript
   interface User {
       name: string;
       age: number;
   }

   const readonlyUser: Readonly<User> = {
       name: 'Alice',
       age: 25
   };

   // readonlyUser.age = 30; // Error: Cannot assign to 'age' because it is a read-only property
   ```

4. **`Record<K, T>`:**
   - Creates an object type with properties `K` of type `T`.

   ```typescript
   type UserRoles = 'admin' | 'editor' | 'viewer';

   const userPermissions: Record<UserRoles, boolean> = {
       admin: true,
       editor: false,
       viewer: true
   };
   ```

5. **`Pick<T, K>`:**
   - Creates a new type by selecting specific properties `K` from a type `T`.

   ```typescript
   interface User {
       name: string;
       age: number;
       email: string;
   }

   type UserNameEmail = Pick<User, 'name' | 'email'>;

   const user: UserNameEmail = {
       name: 'Alice',
       email: 'alice@example.com'
   };
   ```

6. **`Omit<T, K>`:**
   - Creates a new type by omitting specific properties `K` from a type `T`.

   ```typescript
   interface User {
       name: string;
       age: number;
       email: string;
   }

   type UserWithoutEmail = Omit<User, 'email'>;

   const user: UserWithoutEmail = {
       name: 'Alice',
       age: 25
   };
   ```

7. **`Exclude<T, U>`:**
   - Excludes types `U` from a union type `T`.

   ```typescript
   type AllColors = 'red' | 'green' | 'blue' | 'yellow';
   type PrimaryColors = Exclude<AllColors, 'yellow'>; // 'red' | 'green' | 'blue'
   ```

8. **`Extract<T, U>`:**
   - Extracts types `U` from a union type `T`.

   ```typescript
   type AllColors = 'red' | 'green' | 'blue' | 'yellow';
   type PrimaryColors = Extract<AllColors, 'red' | 'green' | 'blue'>; // 'red' | 'green' | 'blue'
   ```

9. **`NonNullable<T>`:**
   - Removes `null` and `undefined` from a type `T`.

   ```typescript
   type NullableString = string | null | undefined;
   type NonNullableString = NonNullable<NullableString>; // string
   ```

10. **`ReturnType<T>`:**
    - Extracts the return type of a function type `T`.

    ```typescript
    function getUser() {
        return { name: 'Alice', age: 25 };
    }

    type UserType = ReturnType<typeof getUser>; // { name: string; age: number }
    ```

11. **`InstanceType<T>`:**
    - Extracts the instance type of a constructor type `T`.

    ```typescript
    class User {
        constructor(public name: string, public age: number) {}
    }

    type UserInstance = InstanceType<typeof User>; // User
    ```

**Use Cases:**

- **Type Transformations:** Create new types by modifying existing ones for different scenarios.
- **Code Reusability:** Reuse types and transformations across multiple components and modules.
- **Flexible Design:** Enhance type flexibility and expressiveness in complex applications.

**Conclusion:**

Utility types in TypeScript provide powerful tools for transforming and manipulating types, enhancing code reusability, flexibility, and expressiveness. By leveraging utility types, developers can create more robust and maintainable applications.

---

#### What is the difference between an Interface and a Type Alias in TypeScript?

**Interface:**

- **Definition:** An interface is a way to define the shape of an object, including properties, methods, and optional or readonly members.

  ```typescript
  interface User {
      name: string;
      age: number;
      greet(): void;
  }
  ```

- **Inheritance:** Interfaces support extending other interfaces using `extends`.

  ```typescript
  interface Person {
      name: string;
  }

  interface Employee extends Person {
      employeeId: number;
  }
  ```

- **Implementation:** Classes can implement interfaces to enforce a contract.

  ```typescript
  class User implements User {
      name: string;
      age: number;
      greet(): void {
          console.log(`Hello, ${this.name}`);
      }
  }
  ```

- **Merging:** Interfaces can be merged, allowing multiple declarations with the same name to combine.

  ```typescript
  interface Point {
      x: number;
  }

  interface Point {
      y: number;
  }

  const point: Point = { x: 10, y: 20 };
  ```

**Type Alias:**

- **Definition:** A type alias defines a custom type by giving a name to a type expression, including unions, intersections, primitives, and more.

  ```typescript
  type User = {
      name: string;
      age: number;
      greet(): void;
  };
  ```

- **Complex Types:** Type aliases can represent complex types, including unions and intersections.

  ```typescript
  type ID = string | number;
  type Employee = User & { employeeId: number };
  ```

- **Aliases for Primitives:** Type aliases can be used to create aliases for primitive types.

  ```typescript
  type Name = string;
  ```

- **Cannot be Merged:** Type aliases cannot be merged like interfaces.

**Key Differences:**

1. **Use Cases:**
   - **Interface:** Use interfaces for defining object shapes, especially when extending or implementing classes.
   - **Type Alias:** Use type aliases for complex types, unions, intersections, and when defining non-object types.

2. **Inheritance:**
   - **Interface:** Supports extending interfaces and implementing in classes.
   - **Type Alias:** Can create intersections with other types but cannot extend or implement.

3. **Declaration Merging:**
   - **Interface:** Supports merging, allowing multiple declarations with the same name.
   - **Type Alias:** Does not support merging.

4. **Syntax:**
   - **Interface:** Uses the `interface` keyword.
   - **Type Alias:** Uses the `type` keyword.

5. **Flexibility:**
   - **Interface:** Suitable for objects with methods and properties.
   - **Type Alias:** Suitable for unions, intersections, primitives, and complex types.

**Example:**

**Interface:**

```typescript
interface User {
    name: string;
    age: number;
    greet(): void;
}
```

**Type Alias:**

```typescript
type User = {
    name: string;
    age: number;
    greet(): void;
};
```

**Use Cases:**

- **Interface:** Use for defining object structures, classes, and APIs.
- **Type Alias:** Use for complex types, unions, intersections, and primitives.

**Conclusion:**

Interfaces and type aliases serve different purposes in TypeScript, with interfaces focusing on object structures and type aliases providing flexibility for complex types. By choosing the appropriate construct, developers can create more organized and expressive code.

---

#### How can you create a class in TypeScript?

To create a class in TypeScript, use the `class` keyword, followed by the class name, properties, and methods.

**Class Declaration:**

1. **Basic Class:**

   ```typescript
   class Person {
       name: string;
       age: number;

       constructor(name: string, age: number) {
           this.name = name;
           this.age = age;
       }

       greet(): void {
           console.log(`Hello, ${this.name}`);
       }
   }
   ```

2. **Access Modifiers:**

   - **`public`:** Accessible from anywhere (default).

     ```typescript
     class Employee {
         public name: string;

         constructor(name: string) {
             this.name = name;
         }
     }
     ```

   - **`private`:** Accessible only within the class.

     ```typescript
     class Employee {
         private salary: number;

         constructor(salary: number) {
             this.salary = salary;
         }

         getSalary(): number {
             return this.salary;
         }
     }
     ```

   - **`protected`:** Accessible within the class and its subclasses.

     ```typescript
     class Employee {
         protected department: string;

         constructor(department: string) {
             this.department = department;
         }
     }
     ```

3. **Readonly Properties:**

   ```typescript
   class Employee {
       readonly id: number;

       constructor(id: number) {
           this.id = id;
       }
   }
   ```

4. **Inheritance:**

   ```typescript
   class Animal {
       makeSound(): void {
           console.log('Animal sound');
       }
   }

   class Dog extends Animal {
       makeSound(): void {
           console.log

('Bark');
       }
   }
   ```

5. **Abstract Classes:**

   ```typescript
   abstract class Shape {
       abstract calculateArea(): number;
   }

   class Circle extends Shape {
       constructor(private radius: number) {
           super();
       }

       calculateArea(): number {
           return Math.PI * this.radius ** 2;
       }
   }
   ```

6. **Getters and Setters:**

   ```typescript
   class Employee {
       private _name: string;

       get name(): string {
           return this._name;
       }

       set name(value: string) {
           this._name = value;
       }
   }
   ```

**Example Usage:**

```typescript
class Person {
    constructor(public name: string, public age: number) {}

    greet(): void {
        console.log(`Hello, ${this.name}`);
    }
}

const person = new Person('Alice', 25);
person.greet(); // 'Hello, Alice'
```

**Conclusion:**

Classes in TypeScript provide a powerful way to define blueprints for objects, encapsulating properties and behaviors. By leveraging features like access modifiers, inheritance, and abstract classes, developers can create robust and maintainable object-oriented code.

---

#### How can you create a function in TypeScript?

To create a function in TypeScript, use the `function` keyword, followed by the function name, parameters with types, and the return type.

**Function Declaration:**

1. **Basic Function:**

   ```typescript
   function add(a: number, b: number): number {
       return a + b;
   }
   ```

2. **Function Expression:**

   ```typescript
   const multiply = (a: number, b: number): number => {
       return a * b;
   };
   ```

3. **Optional Parameters:**

   ```typescript
   function greet(name: string, greeting?: string): string {
       return `${greeting || 'Hello'}, ${name}`;
   }

   console.log(greet('Alice')); // 'Hello, Alice'
   console.log(greet('Alice', 'Hi')); // 'Hi, Alice'
   ```

4. **Default Parameters:**

   ```typescript
   function greet(name: string, greeting: string = 'Hello'): string {
       return `${greeting}, ${name}`;
   }

   console.log(greet('Alice')); // 'Hello, Alice'
   console.log(greet('Alice', 'Hi')); // 'Hi, Alice'
   ```

5. **Rest Parameters:**

   ```typescript
   function sum(...numbers: number[]): number {
       return numbers.reduce((total, num) => total + num, 0);
   }

   console.log(sum(1, 2, 3)); // 6
   ```

6. **Function Overloading:**

   ```typescript
   function format(value: string): string;
   function format(value: number): string;
   function format(value: any): string {
       if (typeof value === 'string') {
           return `String: ${value}`;
       }
       return `Number: ${value}`;
   }

   console.log(format('Alice')); // 'String: Alice'
   console.log(format(42)); // 'Number: 42'
   ```

7. **Arrow Functions:**

   ```typescript
   const greet = (name: string): string => `Hello, ${name}`;
   ```

8. **Void Return Type:**

   ```typescript
   function logMessage(message: string): void {
       console.log(message);
   }
   ```

**Example Usage:**

```typescript
function calculateArea(radius: number): number {
    return Math.PI * radius ** 2;
}

console.log(calculateArea(5)); // 78.53981633974483
```

**Conclusion:**

Functions in TypeScript provide a flexible and type-safe way to define reusable code blocks. By using features like optional parameters, default values, and function overloading, developers can create expressive and robust functions.

---

#### How can you achieve the different OOP pillars in TypeScript?

Object-Oriented Programming (OOP) pillars can be achieved in TypeScript using classes, interfaces, inheritance, and other features.

**1. Encapsulation:**

Encapsulation involves bundling data and methods within a class and restricting access to specific parts.

- **Access Modifiers:** Use `public`, `private`, and `protected` to control access.

  ```typescript
  class Person {
      private name: string;
      private age: number;

      constructor(name: string, age: number) {
          this.name = name;
          this.age = age;
      }

      getName(): string {
          return this.name;
      }

      getAge(): number {
          return this.age;
      }
  }

  const person = new Person('Alice', 25);
  console.log(person.getName()); // 'Alice'
  ```

**2. Inheritance:**

Inheritance allows a class to inherit properties and methods from another class, promoting code reuse.

- **`extends` Keyword:** Use `extends` to create a subclass.

  ```typescript
  class Animal {
      makeSound(): void {
          console.log('Animal sound');
      }
  }

  class Dog extends Animal {
      makeSound(): void {
          console.log('Bark');
      }
  }

  const dog = new Dog();
  dog.makeSound(); // 'Bark'
  ```

**3. Polymorphism:**

Polymorphism allows objects to be treated as instances of their parent class, enabling flexibility and interchangeability.

- **Method Overriding:** Override methods in subclasses to provide specific behavior.

  ```typescript
  class Shape {
      calculateArea(): number {
          return 0;
      }
  }

  class Circle extends Shape {
      constructor(private radius: number) {
          super();
      }

      calculateArea(): number {
          return Math.PI * this.radius ** 2;
      }
  }

  const shape: Shape = new Circle(5);
  console.log(shape.calculateArea()); // 78.53981633974483
  ```

**4. Abstraction:**

Abstraction involves creating abstract classes or interfaces to define common behavior without implementation details.

- **Abstract Classes:** Use `abstract` keyword to define abstract classes and methods.

  ```typescript
  abstract class Vehicle {
      abstract startEngine(): void;
  }

  class Car extends Vehicle {
      startEngine(): void {
          console.log('Engine started');
      }
  }

  const car = new Car();
  car.startEngine(); // 'Engine started'
  ```

- **Interfaces:** Define contracts for classes to implement.

  ```typescript
  interface Drawable {
      draw(): void;
  }

  class Rectangle implements Drawable {
      draw(): void {
          console.log('Drawing rectangle');
      }
  }

  const rectangle = new Rectangle();
  rectangle.draw(); // 'Drawing rectangle'
  ```

**Conclusion:**

TypeScript's OOP features allow developers to implement encapsulation, inheritance, polymorphism, and abstraction, promoting code organization, reuse, and flexibility. By leveraging these pillars, developers can build maintainable and scalable applications.

---

#### What is the purpose of the `tsconfig.json` file?

The `tsconfig.json` file is a configuration file used by the TypeScript compiler to define project-specific settings, compiler options, and file inclusion/exclusion rules.

**Purpose of `tsconfig.json`:**

1. **Compiler Options:**
   - Configure TypeScript compiler behavior, including target ECMAScript version, module system, and more.

   ```json
   {
       "compilerOptions": {
           "target": "ES6",
           "module": "commonjs",
           "strict": true,
           "outDir": "dist",
           "sourceMap": true
       }
   }
   ```

2. **File Inclusion/Exclusion:**
   - Specify which files and directories should be included or excluded from compilation.

   ```json
   {
       "include": ["src/**/*.ts"],
       "exclude": ["node_modules", "dist"]
   }
   ```

3. **Project Structure:**
   - Define the project's root directory and output directory for compiled files.

   ```json
   {
       "compilerOptions": {
           "rootDir": "src",
           "outDir": "dist"
       }
   }
   ```

4. **Type Checking:**
   - Enable or disable strict type-checking options, such as `strictNullChecks` and `noImplicitAny`.

   ```json
   {
       "compilerOptions": {
           "strictNullChecks": true,
           "noImplicitAny": true
       }
   }
   ```

5. **Module Resolution:**
   - Configure how modules are resolved, including paths, aliases, and extensions.

   ```json
   {
       "compilerOptions": {
           "baseUrl": ".",
           "paths": {
               "@components/*": ["src/components/*"]
           }
       }
   }
   ```

6. **Experimental Features:**
   - Enable experimental features, such as decorators and JSX support.

   ```json
   {
       "compilerOptions": {
           "experimentalDecorators": true,
           "jsx": "react"
       }
   }
   ```

7. **Build Mode:**
   - Enable incremental builds and project references for larger projects.

   ```json
   {
       "compilerOptions": {
           "composite": true,
           "incremental": true
       }
   }
   ```

**Example `tsconfig.json`:**

```json
{
    "compilerOptions": {
        "target": "ES6",
        "module": "commonjs",
        "strict": true,
        "outDir": "dist",
        "sourceMap": true,
        "baseUrl": ".",
        "paths": {
            "@components/*": ["src/components/*

"]
        },
        "experimentalDecorators": true,
        "jsx": "react"
    },
    "include": ["src/**/*.ts"],
    "exclude": ["node_modules", "dist"]
}
```

**Benefits:**

- **Consistency:** Ensures consistent compiler settings across the project, reducing discrepancies between environments.
- **Type Safety:** Enforces strict type checking and compiler options, improving code quality and maintainability.
- **Build Configuration:** Simplifies build configuration, making it easy to customize compilation behavior.

**Conclusion:**

The `tsconfig.json` file is an essential part of TypeScript projects, providing a centralized location for configuring the TypeScript compiler. By leveraging its options, developers can customize compilation behavior, enforce coding standards, and improve code quality and maintainability.