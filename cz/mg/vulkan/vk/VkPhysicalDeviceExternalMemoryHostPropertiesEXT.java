package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkPhysicalDeviceExternalMemoryHostPropertiesEXT.html">khronos documentation</a>
 **/
public class VkPhysicalDeviceExternalMemoryHostPropertiesEXT extends VkObject {
    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT() {
        super(sizeof());
    }

    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPhysicalDeviceExternalMemoryHostPropertiesEXT(VkStructureType sType, VkObject pNext, VkDeviceSize minImportedHostPointerAlignment) {
        super(sizeof());
        setSType(sType);
        setPNext(pNext);
        setMinImportedHostPointerAlignment(minImportedHostPointerAlignment);
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

    public VkDeviceSize getMinImportedHostPointerAlignment() {
        return new VkDeviceSize(getVkMemory(), getMinImportedHostPointerAlignment(getVkAddress()));
    }

    
    public void setMinImportedHostPointerAlignment(VkDeviceSize minImportedHostPointerAlignment) {
        setMinImportedHostPointerAlignment(getVkAddress(), minImportedHostPointerAlignment != null ? minImportedHostPointerAlignment.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getMinImportedHostPointerAlignment(long address);
    private static native void setMinImportedHostPointerAlignment(long address, long minImportedHostPointerAlignment);


    public static native long sizeof();

    public static class Array extends VkPhysicalDeviceExternalMemoryHostPropertiesEXT implements cz.mg.collections.array.ReadonlyArray<VkPhysicalDeviceExternalMemoryHostPropertiesEXT> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkPhysicalDeviceExternalMemoryHostPropertiesEXT.sizeof()));
            this.count = count;
        }

        public Array(int count, VkPhysicalDeviceExternalMemoryHostPropertiesEXT o){
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
        public VkPhysicalDeviceExternalMemoryHostPropertiesEXT get(int i){
            return new VkPhysicalDeviceExternalMemoryHostPropertiesEXT(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkPhysicalDeviceExternalMemoryHostPropertiesEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
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

            public Array(VkPhysicalDeviceExternalMemoryHostPropertiesEXT[] a) {
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
