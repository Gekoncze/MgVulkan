package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPeerMemoryFeaturesKHR extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR() {
    }

    protected PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPeerMemoryFeaturesKHR"));
    }

    public void call(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.getNullAddressNative(), localDeviceIndex != null ? localDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative(), remoteDeviceIndex != null ? remoteDeviceIndex.getVkAddress() : VkPointer.getNullAddressNative(), pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void call(long vkaddress, long device, long heapIndex, long localDeviceIndex, long remoteDeviceIndex, long pPeerMemoryFeatures);
}
