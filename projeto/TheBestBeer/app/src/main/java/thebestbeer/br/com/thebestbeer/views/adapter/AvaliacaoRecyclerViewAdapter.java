package thebestbeer.br.com.thebestbeer.views.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import thebestbeer.br.com.thebestbeer.databinding.ItemAvalicaoBinding;
import thebestbeer.br.com.thebestbeer.models.Avaliacao;

public class AvaliacaoRecyclerViewAdapter extends RecyclerView.Adapter<AvaliacaoRecyclerViewAdapter.ViewHolder> {

    private final List<Avaliacao> mListaAvaliacao;

    public AvaliacaoRecyclerViewAdapter(List<Avaliacao> avalicoes){
        mListaAvaliacao = avalicoes;
    }

    @NonNull
    @Override
    public AvaliacaoRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int viewType) {
        // onCreateViewHolder: Cria o layout que sera inflado dentro de cada item do recycler view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemAvalicaoBinding binding = ItemAvalicaoBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Avaliacao avaliacoes = mListaAvaliacao.get(position);
    }

    @Override
    public int getItemCount() {
        return mListaAvaliacao.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private final ItemAvalicaoBinding mBinding;

        ViewHolder(ItemAvalicaoBinding binding){
            super(binding.getRoot());
            mBinding = binding;
        }

        public void bind(Avaliacao avaliacoes) {
            mBinding.setAvaliacao(avaliacoes);
            mBinding.executePendingBindings();
        }
    }

}
