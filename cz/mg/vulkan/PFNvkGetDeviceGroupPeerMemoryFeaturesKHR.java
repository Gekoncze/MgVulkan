package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPeerMemoryFeaturesKHR extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR() {
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHR(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPeerMemoryFeaturesKHR"));
    }

    public void call(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.getNullAddress(), localDeviceIndex != null ? localDeviceIndex.getVkAddress() : VkPointer.getNullAddress(), remoteDeviceIndex != null ? remoteDeviceIndex.getVkAddress() : VkPointer.getNullAddress(), pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long heapIndex, long localDeviceIndex, long remoteDeviceIndex, long pPeerMemoryFeatures);
}
