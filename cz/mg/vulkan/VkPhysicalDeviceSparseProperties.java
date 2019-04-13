package cz.mg.vulkan;

public class VkPhysicalDeviceSparseProperties extends VkObject {
    public VkPhysicalDeviceSparseProperties() {
        super(sizeof());
    }

    public VkPhysicalDeviceSparseProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceSparseProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceSparseProperties(VkBool32 residencyStandard2DBlockShape, VkBool32 residencyStandard2DMultisampleBlockShape, VkBool32 residencyStandard3DBlockShape, VkBool32 residencyAlignedMipSize, VkBool32 residencyNonResidentStrict) {
        super(sizeof());
        setResidencyStandard2DBlockShape(residencyStandard2DBlockShape);
        setResidencyStandard2DMultisampleBlockShape(residencyStandard2DMultisampleBlockShape);
        setResidencyStandard3DBlockShape(residencyStandard3DBlockShape);
        setResidencyAlignedMipSize(residencyAlignedMipSize);
        setResidencyNonResidentStrict(residencyNonResidentStrict);
    }

    public VkBool32 getResidencyStandard2DBlockShape() {
        return new VkBool32(getVkMemory(), getResidencyStandard2DBlockShape(getVkAddress()));
    }

    
    public void setResidencyStandard2DBlockShape(VkBool32 residencyStandard2DBlockShape) {
        setResidencyStandard2DBlockShape(getVkAddress(), residencyStandard2DBlockShape != null ? residencyStandard2DBlockShape.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getResidencyStandard2DBlockShape(long address);
    private static native void setResidencyStandard2DBlockShape(long address, long residencyStandard2DBlockShape);

    public VkBool32 getResidencyStandard2DMultisampleBlockShape() {
        return new VkBool32(getVkMemory(), getResidencyStandard2DMultisampleBlockShape(getVkAddress()));
    }

    
    public void setResidencyStandard2DMultisampleBlockShape(VkBool32 residencyStandard2DMultisampleBlockShape) {
        setResidencyStandard2DMultisampleBlockShape(getVkAddress(), residencyStandard2DMultisampleBlockShape != null ? residencyStandard2DMultisampleBlockShape.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getResidencyStandard2DMultisampleBlockShape(long address);
    private static native void setResidencyStandard2DMultisampleBlockShape(long address, long residencyStandard2DMultisampleBlockShape);

    public VkBool32 getResidencyStandard3DBlockShape() {
        return new VkBool32(getVkMemory(), getResidencyStandard3DBlockShape(getVkAddress()));
    }

    
    public void setResidencyStandard3DBlockShape(VkBool32 residencyStandard3DBlockShape) {
        setResidencyStandard3DBlockShape(getVkAddress(), residencyStandard3DBlockShape != null ? residencyStandard3DBlockShape.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getResidencyStandard3DBlockShape(long address);
    private static native void setResidencyStandard3DBlockShape(long address, long residencyStandard3DBlockShape);

    public VkBool32 getResidencyAlignedMipSize() {
        return new VkBool32(getVkMemory(), getResidencyAlignedMipSize(getVkAddress()));
    }

    
    public void setResidencyAlignedMipSize(VkBool32 residencyAlignedMipSize) {
        setResidencyAlignedMipSize(getVkAddress(), residencyAlignedMipSize != null ? residencyAlignedMipSize.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getResidencyAlignedMipSize(long address);
    private static native void setResidencyAlignedMipSize(long address, long residencyAlignedMipSize);

    public VkBool32 getResidencyNonResidentStrict() {
        return new VkBool32(getVkMemory(), getResidencyNonResidentStrict(getVkAddress()));
    }

    
    public void setResidencyNonResidentStrict(VkBool32 residencyNonResidentStrict) {
        setResidencyNonResidentStrict(getVkAddress(), residencyNonResidentStrict != null ? residencyNonResidentStrict.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getResidencyNonResidentStrict(long address);
    private static native void setResidencyNonResidentStrict(long address, long residencyNonResidentStrict);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSparseProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSparseProperties> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSparseProperties.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceSparseProperties o){
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
        public VkPhysicalDeviceSparseProperties get(int i){
            return new VkPhysicalDeviceSparseProperties(getVkMemory(), getVkAddress() + sizeof()*i);
        }
    }


    public static class Pointer extends VkObject.Pointer {        public Pointer() {
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

        public static class Array extends VkPhysicalDeviceSparseProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSparseProperties.Pointer> {
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

            public Array(VkPhysicalDeviceSparseProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceSparseProperties.Pointer get(int i){
                return new VkPhysicalDeviceSparseProperties.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
