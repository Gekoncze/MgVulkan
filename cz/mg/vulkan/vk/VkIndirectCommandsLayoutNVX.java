package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkIndirectCommandsLayoutNVX.html">khronos documentation</a>
 **/
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

    public static class Pointer extends VkObject.Pointer {
        public Pointer() {
        }

        public Pointer(long value) {
            setValue(value);
        }

        public Pointer(VkMemory vkmemory) {
            super(vkmemory);
        }

        public Pointer(VkMemory vkmemory, long vkaddress) {
            super(vkmemory, vkaddress);
        }

        public static class Array extends VkIndirectCommandsLayoutNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<VkIndirectCommandsLayoutNVX.Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*VkPointer.sizeof()));
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

            public Array(VkIndirectCommandsLayoutNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkIndirectCommandsLayoutNVX.Pointer get(int i){
                return new VkIndirectCommandsLayoutNVX.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
