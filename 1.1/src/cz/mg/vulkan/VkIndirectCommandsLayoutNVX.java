package cz.mg.vulkan;

public class VkIndirectCommandsLayoutNVX extends VkNonDispatchableHandle {
    public VkIndirectCommandsLayoutNVX() {
    }

    protected VkIndirectCommandsLayoutNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkIndirectCommandsLayoutNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkIndirectCommandsLayoutNVX(VkPointer pointer) {
        super(pointer);
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

        public Array(VkIndirectCommandsLayoutNVX o, int count){
            super(o.getVkMemory(), o.getVkAddress());
            this.count = count;
        }

        public Array(VkPointer pointer, int count){
            super(pointer);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, int count) {
            super(vkmemory);
            this.count = count;
        }

        protected Array(VkMemory vkmemory, long vkaddress, int count) {
            super(vkmemory, vkaddress);
            this.count = count;
        }



        public Array(VkIndirectCommandsLayoutNVX... values){
            this(values.length);
            for(int i = 0; i < values.length; i++) get(i).setValue(values[i].getValue());
        }

        @Override
        public int count(){
            return count;
        }

        @Override
        public VkIndirectCommandsLayoutNVX get(int i){
            return new VkIndirectCommandsLayoutNVX(getVkMemory(), address(i));
        }

        protected long address(int i){
            return VkPointer.plus(getVkAddress(), sizeof()*i);
        }

        public static class Array2 extends VkPointer.Array {
            public Array2(int count) {
                super(count);
            }

            protected Array2(VkMemory vkmemory, int count) {
                super(vkmemory, count);
            }

            protected Array2(VkMemory vkmemory, long vkaddress, int count) {
                super(vkmemory, vkaddress, count);
            }
        }
    }
}
