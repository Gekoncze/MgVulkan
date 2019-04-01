package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDedicatedAllocationBufferCreateInfoNV.html">khronos documentation</a>
 **/
public class VkDedicatedAllocationBufferCreateInfoNV extends VkObject {
    public VkDedicatedAllocationBufferCreateInfoNV() {
        super(sizeof());
    }

    public VkDedicatedAllocationBufferCreateInfoNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDedicatedAllocationBufferCreateInfoNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDedicatedAllocationBufferCreateInfoNV(VkObject pNext, VkBool32 dedicatedAllocation) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV));
        setPNext(pNext);
        setDedicatedAllocation(dedicatedAllocation);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    private VkObject pNext = null;
    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext != null ? pNext.getVkAddress() : VkPointer.NULL);
        this.pNext = pNext;
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkBool32 getDedicatedAllocation() {
        return new VkBool32(getVkMemory(), getDedicatedAllocation(getVkAddress()));
    }

    
    public void setDedicatedAllocation(VkBool32 dedicatedAllocation) {
        setDedicatedAllocation(getVkAddress(), dedicatedAllocation != null ? dedicatedAllocation.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDedicatedAllocation(long address);
    private static native void setDedicatedAllocation(long address, long dedicatedAllocation);


    public static native long sizeof();

    public static class Array extends VkDedicatedAllocationBufferCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VkDedicatedAllocationBufferCreateInfoNV> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDedicatedAllocationBufferCreateInfoNV.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDedicatedAllocationBufferCreateInfoNV o){
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
        public VkDedicatedAllocationBufferCreateInfoNV get(int i){
            return new VkDedicatedAllocationBufferCreateInfoNV(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDedicatedAllocationBufferCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkDedicatedAllocationBufferCreateInfoNV[] a) {
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
