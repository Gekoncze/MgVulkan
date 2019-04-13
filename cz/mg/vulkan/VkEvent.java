package cz.mg.vulkan;

public class VkEvent extends VkNonDispatchableHandle {
    public VkEvent() {
    }

    public VkEvent(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkEvent(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkEvent(long handle) {
        setValue(handle);
    }

    public static class Array extends VkEvent implements cz.mg.collections.array.ReadonlyArray<VkEvent> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkEvent.sizeof()));
            this.count = count;
        }

        public Array(int count, VkEvent o){
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
        public VkEvent get(int i){
            return new VkEvent(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
