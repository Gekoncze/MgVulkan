package cz.mg.vulkan;

public class VkPhysicalDeviceSparseProperties extends VkObject {
    public VkPhysicalDeviceSparseProperties() {
        super(sizeof());
    }

    protected VkPhysicalDeviceSparseProperties(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkPhysicalDeviceSparseProperties(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkPhysicalDeviceSparseProperties(VkPointer pointer) {
        super(pointer);
    }



    public VkBool32 getResidencyStandard2DBlockShape() {
        return new VkBool32(getVkMemory(), getResidencyStandard2DBlockShape(getVkAddress()));
    }

    
    public void setResidencyStandard2DBlockShape(VkBool32 residencyStandard2DBlockShape) {
        setResidencyStandard2DBlockShape(getVkAddress(), residencyStandard2DBlockShape != null ? residencyStandard2DBlockShape.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResidencyStandard2DBlockShapeQ() {
        return getResidencyStandard2DBlockShape().getValue();
    }

    public void setResidencyStandard2DBlockShape(int residencyStandard2DBlockShape) {
        getResidencyStandard2DBlockShape().setValue(residencyStandard2DBlockShape);
    }

    protected static native long getResidencyStandard2DBlockShape(long address);
    protected static native void setResidencyStandard2DBlockShape(long address, long residencyStandard2DBlockShape);

    public VkBool32 getResidencyStandard2DMultisampleBlockShape() {
        return new VkBool32(getVkMemory(), getResidencyStandard2DMultisampleBlockShape(getVkAddress()));
    }

    
    public void setResidencyStandard2DMultisampleBlockShape(VkBool32 residencyStandard2DMultisampleBlockShape) {
        setResidencyStandard2DMultisampleBlockShape(getVkAddress(), residencyStandard2DMultisampleBlockShape != null ? residencyStandard2DMultisampleBlockShape.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResidencyStandard2DMultisampleBlockShapeQ() {
        return getResidencyStandard2DMultisampleBlockShape().getValue();
    }

    public void setResidencyStandard2DMultisampleBlockShape(int residencyStandard2DMultisampleBlockShape) {
        getResidencyStandard2DMultisampleBlockShape().setValue(residencyStandard2DMultisampleBlockShape);
    }

    protected static native long getResidencyStandard2DMultisampleBlockShape(long address);
    protected static native void setResidencyStandard2DMultisampleBlockShape(long address, long residencyStandard2DMultisampleBlockShape);

    public VkBool32 getResidencyStandard3DBlockShape() {
        return new VkBool32(getVkMemory(), getResidencyStandard3DBlockShape(getVkAddress()));
    }

    
    public void setResidencyStandard3DBlockShape(VkBool32 residencyStandard3DBlockShape) {
        setResidencyStandard3DBlockShape(getVkAddress(), residencyStandard3DBlockShape != null ? residencyStandard3DBlockShape.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResidencyStandard3DBlockShapeQ() {
        return getResidencyStandard3DBlockShape().getValue();
    }

    public void setResidencyStandard3DBlockShape(int residencyStandard3DBlockShape) {
        getResidencyStandard3DBlockShape().setValue(residencyStandard3DBlockShape);
    }

    protected static native long getResidencyStandard3DBlockShape(long address);
    protected static native void setResidencyStandard3DBlockShape(long address, long residencyStandard3DBlockShape);

    public VkBool32 getResidencyAlignedMipSize() {
        return new VkBool32(getVkMemory(), getResidencyAlignedMipSize(getVkAddress()));
    }

    
    public void setResidencyAlignedMipSize(VkBool32 residencyAlignedMipSize) {
        setResidencyAlignedMipSize(getVkAddress(), residencyAlignedMipSize != null ? residencyAlignedMipSize.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResidencyAlignedMipSizeQ() {
        return getResidencyAlignedMipSize().getValue();
    }

    public void setResidencyAlignedMipSize(int residencyAlignedMipSize) {
        getResidencyAlignedMipSize().setValue(residencyAlignedMipSize);
    }

    protected static native long getResidencyAlignedMipSize(long address);
    protected static native void setResidencyAlignedMipSize(long address, long residencyAlignedMipSize);

    public VkBool32 getResidencyNonResidentStrict() {
        return new VkBool32(getVkMemory(), getResidencyNonResidentStrict(getVkAddress()));
    }

    
    public void setResidencyNonResidentStrict(VkBool32 residencyNonResidentStrict) {
        setResidencyNonResidentStrict(getVkAddress(), residencyNonResidentStrict != null ? residencyNonResidentStrict.getVkAddress() : VkPointer.getNullAddressNative());
        
    }

    public int getResidencyNonResidentStrictQ() {
        return getResidencyNonResidentStrict().getValue();
    }

    public void setResidencyNonResidentStrict(int residencyNonResidentStrict) {
        getResidencyNonResidentStrict().setValue(residencyNonResidentStrict);
    }

    protected static native long getResidencyNonResidentStrict(long address);
    protected static native void setResidencyNonResidentStrict(long address, long residencyNonResidentStrict);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceSparseProperties implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceSparseProperties> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceSparseProperties.sizeof()));
            this.count = count;
        }

        public Array(VkPhysicalDeviceSparseProperties o, int count){
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





        @Override
        public int count(){
            return count;
        }

        @Override
        public VkPhysicalDeviceSparseProperties get(int i){
            return new VkPhysicalDeviceSparseProperties(getVkMemory(), addressAt(i));
        }

        protected long addressAt(int i){
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
