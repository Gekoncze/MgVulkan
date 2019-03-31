package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceCreateInfo.html">khronos documentation</a>
 **/
public class VkDeviceCreateInfo extends VkObject {
    public VkDeviceCreateInfo() {
        super(sizeof());
    }

    public VkDeviceCreateInfo(VkMemory vkmemory) {
        super(sizeof(), vkmemory);
    }

    public VkDeviceCreateInfo(VkMemory vkmemory, long vkaddress) {
        super(sizeof(), vkmemory, vkaddress);
    }


    public VkDeviceCreateInfo(VkObject pNext, VkDeviceCreateFlags flags, VkUInt32 queueCreateInfoCount, VkDeviceQueueCreateInfo pQueueCreateInfos, VkUInt32 enabledLayerCount, VkChar ppEnabledLayerNames, VkUInt32 enabledExtensionCount, VkChar ppEnabledExtensionNames, VkPhysicalDeviceFeatures pEnabledFeatures) {
        super(sizeof());
        setSType(new VkStructureType(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO));
        setPNext(pNext);
        setFlags(flags);
        setQueueCreateInfoCount(queueCreateInfoCount);
        setPQueueCreateInfos(pQueueCreateInfos);
        setEnabledLayerCount(enabledLayerCount);
        setPpEnabledLayerNames(ppEnabledLayerNames);
        setEnabledExtensionCount(enabledExtensionCount);
        setPpEnabledExtensionNames(ppEnabledExtensionNames);
        setPEnabledFeatures(pEnabledFeatures);
    }

    public VkStructureType getSType() {
        return new VkStructureType(getVkMemory(), getSType(getVkAddress()));
    }

    public void setSType(VkStructureType sType) {
        setSType(getVkAddress(), sType.getVkAddress());
    }

    private static native long getSType(long address);
    private static native void setSType(long address, long sType);

    public VkObject getPNext() {
        return new VkObject(getVkMemory(), getPNext(getVkAddress()));
    }

    public void setPNext(VkObject pNext) {
        setPNext(getVkAddress(), pNext.getVkAddress());
    }

    private static native long getPNext(long address);
    private static native void setPNext(long address, long pNext);

    public VkDeviceCreateFlags getFlags() {
        return new VkDeviceCreateFlags(getVkMemory(), getFlags(getVkAddress()));
    }

    public void setFlags(VkDeviceCreateFlags flags) {
        setFlags(getVkAddress(), flags.getVkAddress());
    }

    private static native long getFlags(long address);
    private static native void setFlags(long address, long flags);

    public VkUInt32 getQueueCreateInfoCount() {
        return new VkUInt32(getVkMemory(), getQueueCreateInfoCount(getVkAddress()));
    }

    public void setQueueCreateInfoCount(VkUInt32 queueCreateInfoCount) {
        setQueueCreateInfoCount(getVkAddress(), queueCreateInfoCount.getVkAddress());
    }

    private static native long getQueueCreateInfoCount(long address);
    private static native void setQueueCreateInfoCount(long address, long queueCreateInfoCount);

    public VkDeviceQueueCreateInfo.Array getPQueueCreateInfos() {
        return new VkDeviceQueueCreateInfo.Array(getVkMemory(), getPQueueCreateInfos(getVkAddress()), getQueueCreateInfoCount().getValue());
    }

    public void setPQueueCreateInfos(VkDeviceQueueCreateInfo pQueueCreateInfos) {
        setPQueueCreateInfos(getVkAddress(), pQueueCreateInfos.getVkAddress());
    }

    private static native long getPQueueCreateInfos(long address);
    private static native void setPQueueCreateInfos(long address, long pQueueCreateInfos);

    public VkUInt32 getEnabledLayerCount() {
        return new VkUInt32(getVkMemory(), getEnabledLayerCount(getVkAddress()));
    }

    public void setEnabledLayerCount(VkUInt32 enabledLayerCount) {
        setEnabledLayerCount(getVkAddress(), enabledLayerCount.getVkAddress());
    }

    private static native long getEnabledLayerCount(long address);
    private static native void setEnabledLayerCount(long address, long enabledLayerCount);

    public VkChar.Array getPpEnabledLayerNames() {
        return new VkChar.Array(getVkMemory(), getPpEnabledLayerNames(getVkAddress()), getEnabledLayerCount().getValue());
    }

    public void setPpEnabledLayerNames(VkChar ppEnabledLayerNames) {
        setPpEnabledLayerNames(getVkAddress(), ppEnabledLayerNames.getVkAddress());
    }

    private static native long getPpEnabledLayerNames(long address);
    private static native void setPpEnabledLayerNames(long address, long ppEnabledLayerNames);

    public VkUInt32 getEnabledExtensionCount() {
        return new VkUInt32(getVkMemory(), getEnabledExtensionCount(getVkAddress()));
    }

    public void setEnabledExtensionCount(VkUInt32 enabledExtensionCount) {
        setEnabledExtensionCount(getVkAddress(), enabledExtensionCount.getVkAddress());
    }

    private static native long getEnabledExtensionCount(long address);
    private static native void setEnabledExtensionCount(long address, long enabledExtensionCount);

    public VkChar.Array getPpEnabledExtensionNames() {
        return new VkChar.Array(getVkMemory(), getPpEnabledExtensionNames(getVkAddress()), getEnabledExtensionCount().getValue());
    }

    public void setPpEnabledExtensionNames(VkChar ppEnabledExtensionNames) {
        setPpEnabledExtensionNames(getVkAddress(), ppEnabledExtensionNames.getVkAddress());
    }

    private static native long getPpEnabledExtensionNames(long address);
    private static native void setPpEnabledExtensionNames(long address, long ppEnabledExtensionNames);

    public VkPhysicalDeviceFeatures getPEnabledFeatures() {
        return new VkPhysicalDeviceFeatures(getVkMemory(), getPEnabledFeatures(getVkAddress()));
    }

    public void setPEnabledFeatures(VkPhysicalDeviceFeatures pEnabledFeatures) {
        setPEnabledFeatures(getVkAddress(), pEnabledFeatures.getVkAddress());
    }

    private static native long getPEnabledFeatures(long address);
    private static native void setPEnabledFeatures(long address, long pEnabledFeatures);


    public static native long sizeof();

    public static class Array extends VkDeviceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VkDeviceCreateInfo> {
        private final int count;

        public Array(int count) {
            super(new VkMemory(count*sizeof()));
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

        public static class Array extends Pointer implements cz.mg.collections.array.ReadonlyArray<Pointer> {
            private final int count;

            public Array(int count) {
                super(new VkMemory(count*sizeof()));
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
            public Pointer get(int i){
                return new Pointer(getVkMemory(), getVkAddress() + VkPointer.sizeof()*i);
            }
        }
    }
}
