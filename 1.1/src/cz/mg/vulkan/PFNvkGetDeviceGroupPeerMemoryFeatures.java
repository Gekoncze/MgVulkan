package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPeerMemoryFeatures extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPeerMemoryFeatures() {
    }

    protected PFNvkGetDeviceGroupPeerMemoryFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceGroupPeerMemoryFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPeerMemoryFeatures(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeatures(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPeerMemoryFeatures"));
    }

    public void call(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures);

}
