package cz.mg.vulkan;

public class VkDeviceCreateInfo extends VkObject {
    public VkDeviceCreateInfo() {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO));
    }

    public VkDeviceCreateInfo(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    
    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType != null ? sType.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkDeviceCreateFlags getFlags() {
        return new VkDeviceCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    
    public void setFlags(VkDeviceCreateFlags flags) {
        setFlags(getVkAddress(), flags != null ? flags.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getQueueCreateInfoCount() {
        return new VkUInt32(getVkMemory(), getQueueCreateInfoCount(getVkAddress()));
    }

    
    public void setQueueCreateInfoCount(VkUInt32 queueCreateInfoCount) {
        setQueueCreateInfoCount(getVkAddress(), queueCreateInfoCount != null ? queueCreateInfoCount.getVkAddress() : VkPointer.getSinkAddress());
        
    }

    private static native long getQueueCreateInfoCount(long address);
    private static native void setQueueCreateInfoCount(long address, long queueCreateInfoCount);

    public VkDeviceQueueCreateInfo getPQueueCreateInfos() {
        return new VkDeviceQueueCreateInfo(getVkMemory(), getPQueueCreateInfos(getVkAddress()));
    }

    private VkObject pQueueCreateInfos = null;
    public void setPQueueCreateInfos(VkDeviceQueueCreateInfo pQueueCreateInfos) {
        setPQueueCreateInfos(getVkAddress(), pQueueCreateInfos != null ? pQueueCreateInfos.getVkAddress() : VkPointer.NULL);
        this.pQueueCreateInfos = pQueueCreateInfos;
    }

    private static native long getPQueueCreateInfos(long address);
    private static native void setPQueueCreateInfos(long address, long pQueueCreateInfos);

    public VkUInt32 getEnabledLayerCount() {
        return new VkUInt32(getVkMemory(), getEnabledLayerCount(getVkAddress()));
    }

    
    public void setEnabledLayerCount(VkUInt32 enabledLayerCount) {
        setEnabledLayerCount(getVkAddress(), enabledLayerCount != null ? enabledLayerCount.getVkAddress() : VkPointer.getSinkAddress());
        
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
        setEnabledExtensionCount(getVkAddress(), enabledExtensionCount != null ? enabledExtensionCount.getVkAddress() : VkPointer.getSinkAddress());
        
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

    public VkPhysicalDeviceFeatures getPEnabledFeatures() {
        return new VkPhysicalDeviceFeatures(getVkMemory(), getPEnabledFeatures(getVkAddress()));
    }

    private VkObject pEnabledFeatures = null;
    public void setPEnabledFeatures(VkPhysicalDeviceFeatures pEnabledFeatures) {
        setPEnabledFeatures(getVkAddress(), pEnabledFeatures != null ? pEnabledFeatures.getVkAddress() : VkPointer.NULL);
        this.pEnabledFeatures = pEnabledFeatures;
    }

    private static native long getPEnabledFeatures(long address);
    private static native void setPEnabledFeatures(long address, long pEnabledFeatures);


    public static native long sizeof();

    public static class Array extends VkDeviceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*VkDeviceCreateInfo.sizeof()));
            this.count = count;
        }

        public Array(int count, VkDeviceCreateInfo o){
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
        public VkDeviceCreateInfo get(int i){
            return new VkDeviceCreateInfo(getVkMemory(), getVkAddress() + sizeof()*i);
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

        public static class Array extends VkDeviceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VkDeviceCreateInfo.Pointer> {
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

            public Array(VkDeviceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVkAddress());
            }

            @Override
            public int count(){
                return count;
            }

            @Override
            public VkDeviceCreateInfo.Pointer get(int i){
                return new VkDeviceCreateInfo.Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
