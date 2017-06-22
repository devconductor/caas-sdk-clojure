(ns pier-sdk-clojure.api.compra
  (:require [pier-sdk-clojure.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn efetivar-antecipacao-using-post-with-http-info
  "Faz a efetivaÃ§Ã£o da antecipaÃ§Ã£o
  Metodo responsavel pela efetivaÃ§Ã£o da antecipaÃ§Ã£o."
  [id-conta id quantidade-parcelas ]
  (call-api "/api/compras/{id}/efetivar-antecipacao" :post
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"idConta" id-conta "quantidadeParcelas" quantidade-parcelas }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn efetivar-antecipacao-using-post
  "Faz a efetivaÃ§Ã£o da antecipaÃ§Ã£o
  Metodo responsavel pela efetivaÃ§Ã£o da antecipaÃ§Ã£o."
  [id-conta id quantidade-parcelas ]
  (:data (efetivar-antecipacao-using-post-with-http-info id-conta id quantidade-parcelas)))

(defn listar-using-get6-with-http-info
  "Listar compras
  Lista as compras de uma conta."
  ([id-conta ] (listar-using-get6-with-http-info id-conta nil))
  ([id-conta {:keys [page limit id-compra parcelada juros tipo-origem-transacao ]}]
   (call-api "/api/compras" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"page" page "limit" limit "idCompra" id-compra "idConta" id-conta "parcelada" parcelada "juros" juros "tipoOrigemTransacao" tipo-origem-transacao }
              :form-params   {}
              :content-types ["application/json"]
              :accepts       ["application/json"]
              :auth-names    []})))

(defn listar-using-get6
  "Listar compras
  Lista as compras de uma conta."
  ([id-conta ] (listar-using-get6 id-conta nil))
  ([id-conta optional-params]
   (:data (listar-using-get6-with-http-info id-conta optional-params))))

(defn simular-antecipacao-using-get-with-http-info
  "Simular antecipaÃ§Ã£o de parcelas
  Simula a antecipaÃ§Ã£o de parcelas de um evento, listando todos os planos de parcelamento disponÃ­veis."
  [id-conta id ]
  (call-api "/api/compras/{id}/simular-antecipacao" :get
            {:path-params   {"id" id }
             :header-params {}
             :query-params  {"idConta" id-conta }
             :form-params   {}
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn simular-antecipacao-using-get
  "Simular antecipaÃ§Ã£o de parcelas
  Simula a antecipaÃ§Ã£o de parcelas de um evento, listando todos os planos de parcelamento disponÃ­veis."
  [id-conta id ]
  (:data (simular-antecipacao-using-get-with-http-info id-conta id)))
