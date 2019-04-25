package cz.mg.vulkan;

public class VkPipelineLayout extends VkNonDispatchableHandle {
    public VkPipelineLayout() {
    }

    public VkPipelineLayout(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineLayout(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPipelineLayout(long handle) {
        setValue(handle);
    }

    public static class Array extends VkPipelineLayout implements cz.mg.collections.array.ReadonlyArray<VkPipelineLayout> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPipelineLayout.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPipelineLayout o){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        public Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPipelineLayout get(int i){
            return new VkPipelineLayout(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }
    }
}
