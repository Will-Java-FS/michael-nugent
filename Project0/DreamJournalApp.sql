--
-- PostgreSQL database dump
--

-- Dumped from database version 14.12 (Ubuntu 14.12-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.12 (Ubuntu 14.12-0ubuntu0.22.04.1)

-- Started on 2024-08-03 22:03:36 PDT

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 4 (class 2615 OID 16473)
-- Name: testcase; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA testcase;


--
-- TOC entry 3373 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA testcase; Type: COMMENT; Schema: -; Owner: -
--

COMMENT ON SCHEMA testcase IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 16474)
-- Name: dreams; Type: TABLE; Schema: testcase; Owner: -
--

CREATE TABLE testcase.dreams (
    id integer NOT NULL,
    time_stamp timestamp without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    themes text[],
    archetypes smallint[],
    description text,
    image_name integer,
    interpretation_ai text,
    interpretation_user text,
    user_id integer,
    fk_userid integer
);


--
-- TOC entry 211 (class 1259 OID 16480)
-- Name: dreams_d_id_seq; Type: SEQUENCE; Schema: testcase; Owner: -
--

ALTER TABLE testcase.dreams ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME testcase.dreams_d_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 215 (class 1259 OID 16494)
-- Name: token; Type: TABLE; Schema: testcase; Owner: -
--

CREATE TABLE testcase.token (
    id integer NOT NULL,
    token character varying,
    revoked boolean,
    expired boolean,
    user_id integer,
    token_type character varying
);


--
-- TOC entry 214 (class 1259 OID 16493)
-- Name: token_id_seq; Type: SEQUENCE; Schema: testcase; Owner: -
--

ALTER TABLE testcase.token ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME testcase.token_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 212 (class 1259 OID 16481)
-- Name: users; Type: TABLE; Schema: testcase; Owner: -
--

CREATE TABLE testcase.users (
    username character varying,
    user_id integer NOT NULL,
    password character varying,
    first_name character varying,
    last_name character varying,
    email character varying,
    role character varying
);


--
-- TOC entry 213 (class 1259 OID 16492)
-- Name: users_userid_seq; Type: SEQUENCE; Schema: testcase; Owner: -
--

ALTER TABLE testcase.users ALTER COLUMN user_id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME testcase.users_userid_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 3362 (class 0 OID 16474)
-- Dependencies: 210
-- Data for Name: dreams; Type: TABLE DATA; Schema: testcase; Owner: -
--

COPY testcase.dreams (id, time_stamp, themes, archetypes, description, image_name, interpretation_ai, interpretation_user, user_id, fk_userid) FROM stdin;
4	2024-08-01 15:41:47.005877	{running,walking}	{5,6}	Dreamt of running through a forest in snow covered mountains and then jumping into a river.	5	Possible interpretation of desire for freedom and fear of failure.	User interpretation of feeling trapped in daily routine.	\N	1
5	2024-07-31 15:34:59.550144	{skydiving,falling}	{1,2}	Dreamt of flying over mountains and then falling into a river.	1	Possible interpretation of desire for freedom and fear of failure.	User interpretation of feeling trapped in daily routine.	\N	2
7	2024-08-03 09:17:01.832619	{flying,freedom,sky}	{1,5,12}	I was flying over a vast landscape, feeling free and unburdened.	101	Dreaming of flying signifies a desire for freedom and escape.	I think this dream is about wanting to break free from daily routines.	1	1
8	2024-08-03 09:17:01.832619	{falling,fear,heights}	{2,7}	I fell from a tall building but woke up just before hitting the ground.	102	Falling dreams often indicate insecurities or a lack of control.	I believe this dream reflects my current stress and anxiety.	2	2
9	2024-08-03 09:17:01.832619	{water,calm,ocean}	{3,8}	I was swimming in a calm ocean, feeling at peace with the world.	103	Water in dreams often symbolizes emotions and tranquility.	This dream may represent my desire for peace and relaxation.	3	3
10	2024-08-03 09:17:01.832619	{chase,danger,unknown}	{4,9,14}	I was being chased by an unknown figure through a dark alley.	104	Being chased in a dream can represent running from problems or fears.	This dream likely relates to the pressures I feel at work.	4	4
11	2024-08-03 09:17:01.832619	{lost,confusion,maze}	{5,10,15}	I found myself lost in a maze, unable to find my way out.	105	Dreams of being lost often signify feelings of confusion or lack of direction.	I interpret this as my subconscious reflecting my career indecision.	5	5
12	2024-08-03 09:17:01.832619	{animals,wild,lion}	{6,11,16}	I encountered a lion in the wild, and we communicated without words.	106	Animals in dreams can symbolize instinctual behavior or emotions.	This dream might represent my need to connect with my primal instincts.	6	6
13	2024-08-03 09:17:01.832619	{love,connection,partner}	{7,12}	I was on a romantic date with someone I deeply connected with.	107	Dreams about love often reflect desires for connection and intimacy.	I think this dream is about my longing for a meaningful relationship.	7	7
14	2024-08-03 09:17:01.832619	{"time travel",past,history}	{8,13,17}	I traveled back to the medieval era and explored ancient castles.	108	Time travel dreams can symbolize a wish to revisit past experiences or explore history.	This dream might be my curiosity about history and past events.	8	8
15	2024-08-03 09:17:01.832619	{exam,stress,preparation}	{9,14}	I was taking an exam but hadn’t studied for it, feeling stressed.	109	Exam dreams often relate to feelings of being tested or unprepared.	This dream could reflect my worries about upcoming challenges.	9	9
16	2024-08-03 09:17:01.832619	{victory,success,achievement}	{10,15,18}	I stood on a podium, winning a gold medal, feeling accomplished.	110	Dreams of victory signify aspirations for success and recognition.	I interpret this dream as my drive to succeed in my personal goals.	10	10
17	2024-08-03 09:18:17.821493	{running,fighting}	{10,12}	I'm in a cave with pirates.  They have stolen treasure I seek to recover.	10	Possible interpretation of desire for freedom and fear of failure.	I want to find more meaning in something, but their are obstacles.	\N	0
6	2024-08-02 11:54:38.567619	{running,fighting,healing}	{11,12}	I'm in a cave with big and bad pirates.  They have stolen treasure I seek to recover.	10	Possible interpretation of desire for freedom and fear of failure.	I want to find more meaning in something, but there are obstacles.	\N	2
\.


--
-- TOC entry 3367 (class 0 OID 16494)
-- Dependencies: 215
-- Data for Name: token; Type: TABLE DATA; Schema: testcase; Owner: -
--

COPY testcase.token (id, token, revoked, expired, user_id, token_type) FROM stdin;
\.


--
-- TOC entry 3364 (class 0 OID 16481)
-- Dependencies: 212
-- Data for Name: users; Type: TABLE DATA; Schema: testcase; Owner: -
--

COPY testcase.users (username, user_id, password, first_name, last_name, email, role) FROM stdin;
NugentMichael	1	password	\N	\N	\N	\N
JFK	2	password	\N	\N	\N	\N
TestUser0	3	password	\N	\N	\N	\N
TestUser2	4	password	\N	\N	\N	\N
TestUser22	5	$2a$10$NPBYE54KSgn6XbkUHZGKquABK6LC9jrJe17oJxGJGSsb6yABVZgXu	\N	\N	\N	USER
\.


--
-- TOC entry 3374 (class 0 OID 0)
-- Dependencies: 211
-- Name: dreams_d_id_seq; Type: SEQUENCE SET; Schema: testcase; Owner: -
--

SELECT pg_catalog.setval('testcase.dreams_d_id_seq', 17, true);


--
-- TOC entry 3375 (class 0 OID 0)
-- Dependencies: 214
-- Name: token_id_seq; Type: SEQUENCE SET; Schema: testcase; Owner: -
--

SELECT pg_catalog.setval('testcase.token_id_seq', 1, false);


--
-- TOC entry 3376 (class 0 OID 0)
-- Dependencies: 213
-- Name: users_userid_seq; Type: SEQUENCE SET; Schema: testcase; Owner: -
--

SELECT pg_catalog.setval('testcase.users_userid_seq', 9, true);


--
-- TOC entry 3218 (class 2606 OID 16487)
-- Name: dreams dreams_pkey; Type: CONSTRAINT; Schema: testcase; Owner: -
--

ALTER TABLE ONLY testcase.dreams
    ADD CONSTRAINT dreams_pkey PRIMARY KEY (id);


--
-- TOC entry 3222 (class 2606 OID 16500)
-- Name: token token_pkey; Type: CONSTRAINT; Schema: testcase; Owner: -
--

ALTER TABLE ONLY testcase.token
    ADD CONSTRAINT token_pkey PRIMARY KEY (id);


--
-- TOC entry 3220 (class 2606 OID 16491)
-- Name: users users_pkey; Type: CONSTRAINT; Schema: testcase; Owner: -
--

ALTER TABLE ONLY testcase.users
    ADD CONSTRAINT users_pkey PRIMARY KEY (user_id);


-- Completed on 2024-08-03 22:03:36 PDT

--
-- PostgreSQL database dump complete
--
