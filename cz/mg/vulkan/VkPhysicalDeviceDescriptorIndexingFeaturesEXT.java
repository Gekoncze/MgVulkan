package cz.mg.vulkan;

public class VkPhysicalDeviceDescriptorIndexingFeaturesEXT extends VkObject {
    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(VkStructureType sType, VkObject pNext, VkBool32 shaderInputAttachmentArrayDynamicIndexing, VkBool32 shaderUniformTexelBufferArrayDynamicIndexing, VkBool32 shaderStorageTexelBufferArrayDynamicIndexing, VkBool32 shaderUniformBufferArrayNonUniformIndexing, VkBool32 shaderSampledImageArrayNonUniformIndexing, VkBool32 shaderStorageBufferArrayNonUniformIndexing, VkBool32 shaderStorageImageArrayNonUniformIndexing, VkBool32 shaderInputAttachmentArrayNonUniformIndexing, VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing, VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing, VkBool32 descriptorBindingUniformBufferUpdateAfterBind, VkBool32 descriptorBindingSampledImageUpdateAfterBind, VkBool32 descriptorBindingStorageImageUpdateAfterBind, VkBool32 descriptorBindingStorageBufferUpdateAfterBind, VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind, VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind, VkBool32 descriptorBindingUpdateUnusedWhilePending, VkBool32 descriptorBindingPartiallyBound, VkBool32 descriptorBindingVariableDescriptorCount, VkBool32 runtimeDescriptorArray) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setShaderInputAttachmentArrayDynamicIndexing(shaderInputAttachmentArrayDynamicIndexing);
        setShaderUniformTexelBufferArrayDynamicIndexing(shaderUniformTexelBufferArrayDynamicIndexing);
        setShaderStorageTexelBufferArrayDynamicIndexing(shaderStorageTexelBufferArrayDynamicIndexing);
        setShaderUniformBufferArrayNonUniformIndexing(shaderUniformBufferArrayNonUniformIndexing);
        setShaderSampledImageArrayNonUniformIndexing(shaderSampledImageArrayNonUniformIndexing);
        setShaderStorageBufferArrayNonUniformIndexing(shaderStorageBufferArrayNonUniformIndexing);
        setShaderStorageImageArrayNonUniformIndexing(shaderStorageImageArrayNonUniformIndexing);
        setShaderInputAttachmentArrayNonUniformIndexing(shaderInputAttachmentArrayNonUniformIndexing);
        setShaderUniformTexelBufferArrayNonUniformIndexing(shaderUniformTexelBufferArrayNonUniformIndexing);
        setShaderStorageTexelBufferArrayNonUniformIndexing(shaderStorageTexelBufferArrayNonUniformIndexing);
        setDescriptorBindingUniformBufferUpdateAfterBind(descriptorBindingUniformBufferUpdateAfterBind);
        setDescriptorBindingSampledImageUpdateAfterBind(descriptorBindingSampledImageUpdateAfterBind);
        setDescriptorBindingStorageImageUpdateAfterBind(descriptorBindingStorageImageUpdateAfterBind);
        setDescriptorBindingStorageBufferUpdateAfterBind(descriptorBindingStorageBufferUpdateAfterBind);
        setDescriptorBindingUniformTexelBufferUpdateAfterBind(descriptorBindingUniformTexelBufferUpdateAfterBind);
        setDescriptorBindingStorageTexelBufferUpdateAfterBind(descriptorBindingStorageTexelBufferUpdateAfterBind);
        setDescriptorBindingUpdateUnusedWhilePending(descriptorBindingUpdateUnusedWhilePending);
        setDescriptorBindingPartiallyBound(descriptorBindingPartiallyBound);
        setDescriptorBindingVariableDescriptorCount(descriptorBindingVariableDescriptorCount);
        setRuntimeDescriptorArray(runtimeDescriptorArray);
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

    public VkBool32 getShaderInputAttachmentArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayDynamicIndexing(VkBool32 shaderInputAttachmentArrayDynamicIndexing) {
        setShaderInputAttachmentArrayDynamicIndexing(getVkAddress(), shaderInputAttachmentArrayDynamicIndexing != null ? shaderInputAttachmentArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderInputAttachmentArrayDynamicIndexing(long address);
    private static native void setShaderInputAttachmentArrayDynamicIndexing(long address, long shaderInputAttachmentArrayDynamicIndexing);

    public VkBool32 getShaderUniformTexelBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformTexelBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderUniformTexelBufferArrayDynamicIndexing(VkBool32 shaderUniformTexelBufferArrayDynamicIndexing) {
        setShaderUniformTexelBufferArrayDynamicIndexing(getVkAddress(), shaderUniformTexelBufferArrayDynamicIndexing != null ? shaderUniformTexelBufferArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderUniformTexelBufferArrayDynamicIndexing(long address);
    private static native void setShaderUniformTexelBufferArrayDynamicIndexing(long address, long shaderUniformTexelBufferArrayDynamicIndexing);

    public VkBool32 getShaderStorageTexelBufferArrayDynamicIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageTexelBufferArrayDynamicIndexing(getVkAddress()));
    }

    
    public void setShaderStorageTexelBufferArrayDynamicIndexing(VkBool32 shaderStorageTexelBufferArrayDynamicIndexing) {
        setShaderStorageTexelBufferArrayDynamicIndexing(getVkAddress(), shaderStorageTexelBufferArrayDynamicIndexing != null ? shaderStorageTexelBufferArrayDynamicIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageTexelBufferArrayDynamicIndexing(long address);
    private static native void setShaderStorageTexelBufferArrayDynamicIndexing(long address, long shaderStorageTexelBufferArrayDynamicIndexing);

    public VkBool32 getShaderUniformBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderUniformBufferArrayNonUniformIndexing(VkBool32 shaderUniformBufferArrayNonUniformIndexing) {
        setShaderUniformBufferArrayNonUniformIndexing(getVkAddress(), shaderUniformBufferArrayNonUniformIndexing != null ? shaderUniformBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderUniformBufferArrayNonUniformIndexing(long address);
    private static native void setShaderUniformBufferArrayNonUniformIndexing(long address, long shaderUniformBufferArrayNonUniformIndexing);

    public VkBool32 getShaderSampledImageArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderSampledImageArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderSampledImageArrayNonUniformIndexing(VkBool32 shaderSampledImageArrayNonUniformIndexing) {
        setShaderSampledImageArrayNonUniformIndexing(getVkAddress(), shaderSampledImageArrayNonUniformIndexing != null ? shaderSampledImageArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderSampledImageArrayNonUniformIndexing(long address);
    private static native void setShaderSampledImageArrayNonUniformIndexing(long address, long shaderSampledImageArrayNonUniformIndexing);

    public VkBool32 getShaderStorageBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderStorageBufferArrayNonUniformIndexing(VkBool32 shaderStorageBufferArrayNonUniformIndexing) {
        setShaderStorageBufferArrayNonUniformIndexing(getVkAddress(), shaderStorageBufferArrayNonUniformIndexing != null ? shaderStorageBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageBufferArrayNonUniformIndexing(long address);
    private static native void setShaderStorageBufferArrayNonUniformIndexing(long address, long shaderStorageBufferArrayNonUniformIndexing);

    public VkBool32 getShaderStorageImageArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageImageArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderStorageImageArrayNonUniformIndexing(VkBool32 shaderStorageImageArrayNonUniformIndexing) {
        setShaderStorageImageArrayNonUniformIndexing(getVkAddress(), shaderStorageImageArrayNonUniformIndexing != null ? shaderStorageImageArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageImageArrayNonUniformIndexing(long address);
    private static native void setShaderStorageImageArrayNonUniformIndexing(long address, long shaderStorageImageArrayNonUniformIndexing);

    public VkBool32 getShaderInputAttachmentArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderInputAttachmentArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderInputAttachmentArrayNonUniformIndexing(VkBool32 shaderInputAttachmentArrayNonUniformIndexing) {
        setShaderInputAttachmentArrayNonUniformIndexing(getVkAddress(), shaderInputAttachmentArrayNonUniformIndexing != null ? shaderInputAttachmentArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderInputAttachmentArrayNonUniformIndexing(long address);
    private static native void setShaderInputAttachmentArrayNonUniformIndexing(long address, long shaderInputAttachmentArrayNonUniformIndexing);

    public VkBool32 getShaderUniformTexelBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderUniformTexelBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderUniformTexelBufferArrayNonUniformIndexing(VkBool32 shaderUniformTexelBufferArrayNonUniformIndexing) {
        setShaderUniformTexelBufferArrayNonUniformIndexing(getVkAddress(), shaderUniformTexelBufferArrayNonUniformIndexing != null ? shaderUniformTexelBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderUniformTexelBufferArrayNonUniformIndexing(long address);
    private static native void setShaderUniformTexelBufferArrayNonUniformIndexing(long address, long shaderUniformTexelBufferArrayNonUniformIndexing);

    public VkBool32 getShaderStorageTexelBufferArrayNonUniformIndexing() {
        return new VkBool32(getVkMemory(), getShaderStorageTexelBufferArrayNonUniformIndexing(getVkAddress()));
    }

    
    public void setShaderStorageTexelBufferArrayNonUniformIndexing(VkBool32 shaderStorageTexelBufferArrayNonUniformIndexing) {
        setShaderStorageTexelBufferArrayNonUniformIndexing(getVkAddress(), shaderStorageTexelBufferArrayNonUniformIndexing != null ? shaderStorageTexelBufferArrayNonUniformIndexing.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getShaderStorageTexelBufferArrayNonUniformIndexing(long address);
    private static native void setShaderStorageTexelBufferArrayNonUniformIndexing(long address, long shaderStorageTexelBufferArrayNonUniformIndexing);

    public VkBool32 getDescriptorBindingUniformBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUniformBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingUniformBufferUpdateAfterBind(VkBool32 descriptorBindingUniformBufferUpdateAfterBind) {
        setDescriptorBindingUniformBufferUpdateAfterBind(getVkAddress(), descriptorBindingUniformBufferUpdateAfterBind != null ? descriptorBindingUniformBufferUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingUniformBufferUpdateAfterBind(long address);
    private static native void setDescriptorBindingUniformBufferUpdateAfterBind(long address, long descriptorBindingUniformBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingSampledImageUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingSampledImageUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingSampledImageUpdateAfterBind(VkBool32 descriptorBindingSampledImageUpdateAfterBind) {
        setDescriptorBindingSampledImageUpdateAfterBind(getVkAddress(), descriptorBindingSampledImageUpdateAfterBind != null ? descriptorBindingSampledImageUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingSampledImageUpdateAfterBind(long address);
    private static native void setDescriptorBindingSampledImageUpdateAfterBind(long address, long descriptorBindingSampledImageUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageImageUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageImageUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageImageUpdateAfterBind(VkBool32 descriptorBindingStorageImageUpdateAfterBind) {
        setDescriptorBindingStorageImageUpdateAfterBind(getVkAddress(), descriptorBindingStorageImageUpdateAfterBind != null ? descriptorBindingStorageImageUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingStorageImageUpdateAfterBind(long address);
    private static native void setDescriptorBindingStorageImageUpdateAfterBind(long address, long descriptorBindingStorageImageUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageBufferUpdateAfterBind(VkBool32 descriptorBindingStorageBufferUpdateAfterBind) {
        setDescriptorBindingStorageBufferUpdateAfterBind(getVkAddress(), descriptorBindingStorageBufferUpdateAfterBind != null ? descriptorBindingStorageBufferUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingStorageBufferUpdateAfterBind(long address);
    private static native void setDescriptorBindingStorageBufferUpdateAfterBind(long address, long descriptorBindingStorageBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingUniformTexelBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUniformTexelBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(VkBool32 descriptorBindingUniformTexelBufferUpdateAfterBind) {
        setDescriptorBindingUniformTexelBufferUpdateAfterBind(getVkAddress(), descriptorBindingUniformTexelBufferUpdateAfterBind != null ? descriptorBindingUniformTexelBufferUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingUniformTexelBufferUpdateAfterBind(long address);
    private static native void setDescriptorBindingUniformTexelBufferUpdateAfterBind(long address, long descriptorBindingUniformTexelBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingStorageTexelBufferUpdateAfterBind() {
        return new VkBool32(getVkMemory(), getDescriptorBindingStorageTexelBufferUpdateAfterBind(getVkAddress()));
    }

    
    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(VkBool32 descriptorBindingStorageTexelBufferUpdateAfterBind) {
        setDescriptorBindingStorageTexelBufferUpdateAfterBind(getVkAddress(), descriptorBindingStorageTexelBufferUpdateAfterBind != null ? descriptorBindingStorageTexelBufferUpdateAfterBind.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingStorageTexelBufferUpdateAfterBind(long address);
    private static native void setDescriptorBindingStorageTexelBufferUpdateAfterBind(long address, long descriptorBindingStorageTexelBufferUpdateAfterBind);

    public VkBool32 getDescriptorBindingUpdateUnusedWhilePending() {
        return new VkBool32(getVkMemory(), getDescriptorBindingUpdateUnusedWhilePending(getVkAddress()));
    }

    
    public void setDescriptorBindingUpdateUnusedWhilePending(VkBool32 descriptorBindingUpdateUnusedWhilePending) {
        setDescriptorBindingUpdateUnusedWhilePending(getVkAddress(), descriptorBindingUpdateUnusedWhilePending != null ? descriptorBindingUpdateUnusedWhilePending.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingUpdateUnusedWhilePending(long address);
    private static native void setDescriptorBindingUpdateUnusedWhilePending(long address, long descriptorBindingUpdateUnusedWhilePending);

    public VkBool32 getDescriptorBindingPartiallyBound() {
        return new VkBool32(getVkMemory(), getDescriptorBindingPartiallyBound(getVkAddress()));
    }

    
    public void setDescriptorBindingPartiallyBound(VkBool32 descriptorBindingPartiallyBound) {
        setDescriptorBindingPartiallyBound(getVkAddress(), descriptorBindingPartiallyBound != null ? descriptorBindingPartiallyBound.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingPartiallyBound(long address);
    private static native void setDescriptorBindingPartiallyBound(long address, long descriptorBindingPartiallyBound);

    public VkBool32 getDescriptorBindingVariableDescriptorCount() {
        return new VkBool32(getVkMemory(), getDescriptorBindingVariableDescriptorCount(getVkAddress()));
    }

    
    public void setDescriptorBindingVariableDescriptorCount(VkBool32 descriptorBindingVariableDescriptorCount) {
        setDescriptorBindingVariableDescriptorCount(getVkAddress(), descriptorBindingVariableDescriptorCount != null ? descriptorBindingVariableDescriptorCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getDescriptorBindingVariableDescriptorCount(long address);
    private static native void setDescriptorBindingVariableDescriptorCount(long address, long descriptorBindingVariableDescriptorCount);

    public VkBool32 getRuntimeDescriptorArray() {
        return new VkBool32(getVkMemory(), getRuntimeDescriptorArray(getVkAddress()));
    }

    
    public void setRuntimeDescriptorArray(VkBool32 runtimeDescriptorArray) {
        setRuntimeDescriptorArray(getVkAddress(), runtimeDescriptorArray != null ? runtimeDescriptorArray.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getRuntimeDescriptorArray(long address);
    private static native void setRuntimeDescriptorArray(long address, long runtimeDescriptorArray);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceDescriptorIndexingFeaturesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDescriptorIndexingFeaturesEXT> {        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceDescriptorIndexingFeaturesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceDescriptorIndexingFeaturesEXT o){
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
        public VkPhysicalDeviceDescriptorIndexingFeaturesEXT get(int i){
            return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer> {
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

            public Array(VkPhysicalDeviceDescriptorIndexingFeaturesEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer get(int i){
                return new VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }

}
