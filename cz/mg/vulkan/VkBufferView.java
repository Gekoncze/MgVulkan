package cz.mg.vulkan;

public class VkBufferView extends VkNonDispatchableHandle {
    public VkBufferView() {
    }

    public VkBufferView(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkBufferView(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkBufferView(long handle) {
        setValue(handle);
    }

    public static class Array extends VkBufferView implements cz.mg.collections.array.ReadonlyArray<VkBufferView> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkBufferView.sizeof()));
            this.count = count;
        }

        public Array(int count, VkBufferView o){
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
        public VkBufferView get(int i){
            return new VkBufferView(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
