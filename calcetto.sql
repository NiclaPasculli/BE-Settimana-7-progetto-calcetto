PGDMP     5    )                z            calcetto    14.1    14.1     ?           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            ?           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ?           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            ?           1262    25367    calcetto    DATABASE     d   CREATE DATABASE calcetto WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Italian_Italy.1252';
    DROP DATABASE calcetto;
                postgres    false            ?            1259    25375 
   calciatore    TABLE     ?   CREATE TABLE public.calciatore (
    id_calciatore integer NOT NULL,
    cognome_giocatore character varying(255),
    nome_calciatore character varying(255),
    ruolo character varying(255),
    id_squadra integer
);
    DROP TABLE public.calciatore;
       public         heap    postgres    false            ?            1259    25387    sequence    TABLE     k   CREATE TABLE public.sequence (
    seq_name character varying(50) NOT NULL,
    seq_count numeric(38,0)
);
    DROP TABLE public.sequence;
       public         heap    postgres    false            ?            1259    25368    squadra    TABLE     ?   CREATE TABLE public.squadra (
    id_squadra integer NOT NULL,
    citta character varying(255),
    nome_squadra character varying(255)
);
    DROP TABLE public.squadra;
       public         heap    postgres    false            ?          0    25375 
   calciatore 
   TABLE DATA           j   COPY public.calciatore (id_calciatore, cognome_giocatore, nome_calciatore, ruolo, id_squadra) FROM stdin;
    public          postgres    false    210   ?       ?          0    25387    sequence 
   TABLE DATA           7   COPY public.sequence (seq_name, seq_count) FROM stdin;
    public          postgres    false    211   ?       ?          0    25368    squadra 
   TABLE DATA           B   COPY public.squadra (id_squadra, citta, nome_squadra) FROM stdin;
    public          postgres    false    209          f           2606    25381    calciatore calciatore_pkey 
   CONSTRAINT     c   ALTER TABLE ONLY public.calciatore
    ADD CONSTRAINT calciatore_pkey PRIMARY KEY (id_calciatore);
 D   ALTER TABLE ONLY public.calciatore DROP CONSTRAINT calciatore_pkey;
       public            postgres    false    210            h           2606    25391    sequence sequence_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.sequence
    ADD CONSTRAINT sequence_pkey PRIMARY KEY (seq_name);
 @   ALTER TABLE ONLY public.sequence DROP CONSTRAINT sequence_pkey;
       public            postgres    false    211            d           2606    25374    squadra squadra_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.squadra
    ADD CONSTRAINT squadra_pkey PRIMARY KEY (id_squadra);
 >   ALTER TABLE ONLY public.squadra DROP CONSTRAINT squadra_pkey;
       public            postgres    false    209            i           2606    25382 #   calciatore fk_calciatore_id_squadra    FK CONSTRAINT     ?   ALTER TABLE ONLY public.calciatore
    ADD CONSTRAINT fk_calciatore_id_squadra FOREIGN KEY (id_squadra) REFERENCES public.squadra(id_squadra);
 M   ALTER TABLE ONLY public.calciatore DROP CONSTRAINT fk_calciatore_id_squadra;
       public          postgres    false    210    3172    209            ?   $   x?3???+NM????N??I?E?1~\1z\\\ ??r      ?      x?v?ww??45?????? "(C      ?      x?????? ? ?     