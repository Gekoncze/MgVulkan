package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTableVertexBufferEntryNVX.html">khronos documentation</a>
 **/
public class VkObjectTableVertexBufferEntryNVX extends VkObject {
    public VkObjectTableVertexBufferEntryNVX() {
        super(sizeof());
    }

    public VkObjectTableVertexBufferEntryNVX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkObjectTableVertexBufferEntryNVX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkObjectTableVertexBufferEntryNVX(VkObjectEntryTypeNVX type, VkObjectEntryUsageFlagsNVX flags, VkBuffer buffer) {
        super(sizeof());
        setType(type);
        setFlags(flags);
        setBuffer(buffer);
    }

    public VkObjectEntryTypeNVX getType() {
        return new VkObjectEntryTypeNVX(getVkMemory(), getType(getVkAddress()));
    }

    
    public void setType(VkObjectEntryTypeNVX type) {
        setType(getVkAddress(), type != null ? type.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getType(long address);
    private static native void setType(long address, long type);

    public VkObjectEntryUsageFlagsNVX getFlags() {
        return new VkObjectEntryUsageFlagsNVX(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkObjectEntryUsageFlagsNVX flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkBuffer getBuffer() {
        return new VkBuffer(getVkMemory(), getBuffer(getVkAddress()));
    }

    
    public void setBuffer(VkBuffer buffer) {
        setBuffer(getVkAddress(), buffer != null ? buffer.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getBuffer(long address);
    private static native void setBuffer(long address, long buffer);


    public static native long sizeof();

    public static class Array extends VkObjectTableVertexBufferEntryNVX implements cz.mg.collections.array.ReadonlyArray<VkObjectTableVertexBufferEntryNVX> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkObjectTableVertexBufferEntryNVX.sizeof()));
            this.count = count;
        }

        public Array(int count, VkObjectTableVertexBufferEntryNVX o){
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
        public VkObjectTableVertexBufferEntryNVX get(int i){
            return new VkObjectTableVertexBufferEntryNVX(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkObjectTableVertexBufferEntryNVX.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkObjectTableVertexBufferEntryNVX[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
