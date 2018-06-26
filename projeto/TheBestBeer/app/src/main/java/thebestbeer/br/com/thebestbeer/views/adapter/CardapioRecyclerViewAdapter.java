package thebestbeer.br.com.thebestbeer.views.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import thebestbeer.br.com.thebestbeer.databinding.ItemCardapioBinding;
import thebestbeer.br.com.thebestbeer.databinding.ItemCervejaBinding;
import thebestbeer.br.com.thebestbeer.models.Cardapio;
import thebestbeer.br.com.thebestbeer.models.Cervejas;

public class CardapioRecyclerViewAdapter extends RecyclerView.Adapter<CardapioRecyclerViewAdapter.ViewHolder>{

    // Lista de itens a serem exibidos no recyclerview
    private final List<Cardapio> mListaCardapio;

    // No construtor recebemos os itens a serem exibidos pelo recycler view
    // e tambem o objeto para tratar eventos
    public CardapioRecyclerViewAdapter(List<Cardapio> cardapios){
        mListaCardapio = cardapios;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        // onCreateViewHolder: Cria o layout que sera inflado dentro de cada item do recycler view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemCardapioBinding binding = ItemCardapioBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    // Desenha os dados do objeto da lista no layout
    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        // onBindViewHolder: Chamado qndo o item do recycler view for ser exibido
        final Cardapio cardapios = mListaCardapio.get(position);

        holder.bind(cardapios);
    }

    @Override
    public int getItemCount() {
        // Retorna o numero de itens da lista
        return mListaCardapio.size();
    }

    /**
     * Classe ViewHolder: que representa os dados que devem ser exibidos
     * para cada item do recycler view
     */
    class ViewHolder extends RecyclerView.ViewHolder{

        private final ItemCardapioBinding mBinding;

        ViewHolder(ItemCardapioBinding binding){
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(Cardapio cardapios) {
            mBinding.setCardapios(cardapios);
            mBinding.executePendingBindings();
        }
    }
}
