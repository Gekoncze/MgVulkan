package cz.mg.vulkan;

public class VkIndirectCommandsLayoutNVX extends VkNonDispatchableHandle {
    public VkIndirectCommandsLayoutNVX() {
    }

    public VkIndirectCommandsLayoutNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkIndirectCommandsLayoutNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkIndirectCommandsLayoutNVX(long handle) {
        setValue(handle);
    }

    public static class Array extends VkIndirectCommandsLayoutNVX implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkIndirectCommandsLayoutNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkIndirectCommandsLayoutNVX o){
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
        public VkIndirectCommandsLayoutNVX get(int i){
            return new VkIndirectCommandsLayoutNVX(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }
}
