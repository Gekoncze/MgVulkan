package cz.mg.vulkan.vk;

public class VkInstanceCreateInfo extends VkObject {
    public VkInstanceCreateInfo() {
        super(sizeof());
    }

    public VkInstanceCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkInstanceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkInstanceCreateInfo(VkObject pNext, VkInstanceCreateFlags flags, VkApplicationInfo pApplicationInfo, VkUInt32 enabledLayerCount, VkChar.Pointer ppEnabledLayerNames, VkUInt32 enabledExtensionCount, VkChar.Pointer ppEnabledExtensionNames) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setPApplicationInfo(pApplicationInfo);
        setEnabledLayerCount(enabledLayerCount);
        setPpEnabledLayerNames(ppEnabledLayerNames);
        setEnabledExtensionCount(enabledExtensionCount);
        setPpEnabledExtensionNames(ppEnabledExtensionNames);
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

    public VkInstanceCreateFlags getFlags() {
        return new VkInstanceCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkInstanceCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkApplicationInfo getPApplicationInfo() {
        return new VkApplicationInfo(getVkMemory(), getPApplicationInfo(getVkAddress()));
    }

    private VkObject pApplicationInfo = null;
    public void setPApplicationInfo(VkApplicationInfo pApplicationInfo) {
        setPApplicationInfo(getVkAddress(), pApplicationInfo != null ? pApplicationInfo.getVkAddress() : VkPointer.NULL);
        this.pApplicationInfo = pApplicationInfo;
    }

    private static native long getPApplicationInfo(long address);
    private static native void setPApplicationInfo(long address, long pApplicationInfo);

    public VkUInt32 getEnabledLayerCount() {
        return new VkUInt32(getVkMemory(), getEnabledLayerCount(getVkAddress()));
    }

    
    public void setEnabledLayerCount(VkUInt32 enabledLayerCount) {
        setEnabledLayerCount(getVkAddress(), enabledLayerCount != null ? enabledLayerCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getEnabledLayerCount(long address);
    private static native void setEnabledLayerCount(long address, long enabledLayerCount);

    public VkChar.Pointer getPpEnabledLayerNames() {
        return new VkChar.Pointer(getVkMemory(), getPpEnabledLayerNames(getVkAddress()));
    }

    private VkObject ppEnabledLayerNames = null;
    public void setPpEnabledLayerNames(VkChar.Pointer ppEnabledLayerNames) {
        setPpEnabledLayerNames(getVkAddress(), ppEnabledLayerNames != null ? ppEnabledLayerNames.getVkAddress() : VkPointer.NULL);
        this.ppEnabledLayerNames = ppEnabledLayerNames;
    }

    private static native long getPpEnabledLayerNames(long address);
    private static native void setPpEnabledLayerNames(long address, long ppEnabledLayerNames);

    public VkUInt32 getEnabledExtensionCount() {
        return new VkUInt32(getVkMemory(), getEnabledExtensionCount(getVkAddress()));
    }

    
    public void setEnabledExtensionCount(VkUInt32 enabledExtensionCount) {
        setEnabledExtensionCount(getVkAddress(), enabledExtensionCount != null ? enabledExtensionCount.getVkAddress() : VkPointer.NULL_ADDRESS);
        
    }

    private static native long getEnabledExtensionCount(long address);
    private static native void setEnabledExtensionCount(long address, long enabledExtensionCount);

    public VkChar.Pointer getPpEnabledExtensionNames() {
        return new VkChar.Pointer(getVkMemory(), getPpEnabledExtensionNames(getVkAddress()));
    }

    private VkObject ppEnabledExtensionNames = null;
    public void setPpEnabledExtensionNames(VkChar.Pointer ppEnabledExtensionNames) {
        setPpEnabledExtensionNames(getVkAddress(), ppEnabledExtensionNames != null ? ppEnabledExtensionNames.getVkAddress() : VkPointer.NULL);
        this.ppEnabledExtensionNames = ppEnabledExtensionNames;
    }

    private static native long getPpEnabledExtensionNames(long address);
    private static native void setPpEnabledExtensionNames(long address, long ppEnabledExtensionNames);


    public static native long sizeof();

    public static class Array extends VkInstanceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkInstanceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkInstanceCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkInstanceCreateInfo o){
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
        public VkInstanceCreateInfo get(int i){
            return new VkInstanceCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkInstanceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkInstanceCreateInfo.Pointer> {
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

            public Array(VkInstanceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkInstanceCreateInfo.Pointer get(int i){
                return new VkInstanceCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
