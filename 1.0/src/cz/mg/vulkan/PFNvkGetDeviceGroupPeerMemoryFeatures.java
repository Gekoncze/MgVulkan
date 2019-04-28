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

    public void call(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.getNullAddressNative(), localDeviceIndex != null ? localDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative(), remoteDeviceIndex != null ? remoteDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative(), pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, long heapIndex, long localDeviceIndex, long remoteDeviceIndex, long pPeerMemoryFeatures);


    public void call(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        callSimplifiedNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callSimplifiedNative(long vkaddress, long device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures);

}
