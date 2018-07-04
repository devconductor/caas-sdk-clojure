(ns pier-sdk-clojure.api.-global-tag-antecipacao-
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn configurar-taxa-antecipacao-using-post-with-http-info
  "{{{produto_resource_configurar_taxa_antecipacao}}}
  {{{produto_resource_configurar_taxa_antecipacao_notes}}}"
  [id taxa-antecipacao-request ]
  (call-api "/api/produtos/{id}/configurar-taxa-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    taxa-antecipacao-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn configurar-taxa-antecipacao-using-post
  "{{{produto_resource_configurar_taxa_antecipacao}}}
  {{{produto_resource_configurar_taxa_antecipacao_notes}}}"
  [id taxa-antecipacao-request ]
  (:data (configurar-taxa-antecipacao-using-post-with-http-info id taxa-antecipacao-request)))

(defn consultar-taxa-antecipacao-using-get-with-http-info
  "{{{produto_resource_consultar_taxa_antecipacao}}}
  {{{produto_resource_consultar_taxa_antecipacao_notes}}}"
  [id tipo-transacao ]
  (call-api "/api/produtos/{id}/consultar-taxa-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"tipoTransacao" tipo-transacao }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn consultar-taxa-antecipacao-using-get
  "{{{produto_resource_consultar_taxa_antecipacao}}}
  {{{produto_resource_consultar_taxa_antecipacao_notes}}}"
  [id tipo-transacao ]
  (:data (consultar-taxa-antecipacao-using-get-with-http-info id tipo-transacao)))

(defn efetivar-antecipacao-using-post-with-http-info
  "{{{compra_antecipavel_resource_efetivar_antecipacao}}}
  {{{compra_antecipavel_resource_efetivar_antecipacao_notes}}}"
  ([id-conta id quantidade-parcelas ] (efetivar-antecipacao-using-post-with-http-info id-conta id quantidade-parcelas nil))
  ([id-conta id quantidade-parcelas {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/{id}/efetivar-antecipacao" :post
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idConta" id-conta "quantidadeParcelas" quantidade-parcelas "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn efetivar-antecipacao-using-post
  "{{{compra_antecipavel_resource_efetivar_antecipacao}}}
  {{{compra_antecipavel_resource_efetivar_antecipacao_notes}}}"
  ([id-conta id quantidade-parcelas ] (efetivar-antecipacao-using-post id-conta id quantidade-parcelas nil))
  ([id-conta id quantidade-parcelas optional-params]
   (:data (efetivar-antecipacao-using-post-with-http-info id-conta id quantidade-parcelas optional-params))))

(defn efetivar-antecipacoes-using-post-with-http-info
  "{{{compra_antecipavel_resource_efetivar_antecipacoes}}}
  {{{compra_antecipavel_resource_efetivar_antecipacoes_notes}}}"
  ([id-conta ] (efetivar-antecipacoes-using-post-with-http-info id-conta nil))
  ([id-conta {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/efetivar-antecipacao" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn efetivar-antecipacoes-using-post
  "{{{compra_antecipavel_resource_efetivar_antecipacoes}}}
  {{{compra_antecipavel_resource_efetivar_antecipacoes_notes}}}"
  ([id-conta ] (efetivar-antecipacoes-using-post id-conta nil))
  ([id-conta optional-params]
   (:data (efetivar-antecipacoes-using-post-with-http-info id-conta optional-params))))

(defn listar-using-get13-with-http-info
  "{{{compra_antecipavel_resource_listar}}}
  {{{compra_antecipavel_resource_listar_notes}}}"
  ([id-conta ] (listar-using-get13-with-http-info id-conta nil))
  ([id-conta {:keys [sort page limit id-compra parcelada juros tipo-origem-transacao ]}]
   (call-api "/api/compras-antecipaveis" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"sort" (with-collection-format sort :multi) "page" page "limit" limit "idCompra" id-compra "idConta" id-conta "parcelada" parcelada "juros" juros "tipoOrigemTransacao" tipo-origem-transacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get13
  "{{{compra_antecipavel_resource_listar}}}
  {{{compra_antecipavel_resource_listar_notes}}}"
  ([id-conta ] (listar-using-get13 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get13-with-http-info id-conta optional-params))))

(defn simular-antecipacao-using-get-with-http-info
  "{{{compra_antecipavel_resource_simular_antecipacao}}}
  {{{compra_antecipavel_resource_simular_antecipacao_notes}}}"
  ([id-conta id ] (simular-antecipacao-using-get-with-http-info id-conta id nil))
  ([id-conta id {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/{id}/simular-antecipacao" :get
             {:path-params   {"id" id }
              :header-params {}
              :query-params  {"idConta" id-conta "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn simular-antecipacao-using-get
  "{{{compra_antecipavel_resource_simular_antecipacao}}}
  {{{compra_antecipavel_resource_simular_antecipacao_notes}}}"
  ([id-conta id ] (simular-antecipacao-using-get id-conta id nil))
  ([id-conta id optional-params]
   (:data (simular-antecipacao-using-get-with-http-info id-conta id optional-params))))

(defn simular-antecipacoes-using-get-with-http-info
  "{{{compra_antecipavel_resource_simular_antecipacoes}}}
  {{{compra_antecipavel_resource_simular_antecipacoes_notes}}}"
  ([id-conta ] (simular-antecipacoes-using-get-with-http-info id-conta nil))
  ([id-conta {:keys [complemento ]}]
   (call-api "/api/compras-antecipaveis/simular-antecipacao" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"idConta" id-conta "complemento" complemento }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn simular-antecipacoes-using-get
  "{{{compra_antecipavel_resource_simular_antecipacoes}}}
  {{{compra_antecipavel_resource_simular_antecipacoes_notes}}}"
  ([id-conta ] (simular-antecipacoes-using-get id-conta nil))
  ([id-conta optional-params]
   (:data (simular-antecipacoes-using-get-with-http-info id-conta optional-params))))
