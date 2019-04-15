package cz.mg.vulkan;

public class VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT extends VkObject {
    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getSTypeQ() {
        return getSType().getValue();
    }

    public void setSType(int sType) {
        getSType().setValue(sType);
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

    public VkUInt32 getMaxVertexAttribDivisor() {
        return new VkUInt32(getVkMemory(), getMaxVertexAttribDivisor(getVkAddress()));
    }

    
    public void setMaxVertexAttribDivisor(VkUInt32 maxVertexAttribDivisor) {
        setMaxVertexAttribDivisor(getVkAddress(), maxVertexAttribDivisor != null ? maxVertexAttribDivisor.getVkAddress() : VkPointer.getNullAddress());
        
    }

    public int getMaxVertexAttribDivisorQ() {
        return getMaxVertexAttribDivisor().getValue();
    }

    public void setMaxVertexAttribDivisor(int maxVertexAttribDivisor) {
        getMaxVertexAttribDivisor().setValue(maxVertexAttribDivisor);
    }

    private static native long getMaxVertexAttribDivisor(long address);
    private static native void setMaxVertexAttribDivisor(long address, long maxVertexAttribDivisor);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT o){
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
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT get(int i){
            return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer get(int i){
                return new VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
