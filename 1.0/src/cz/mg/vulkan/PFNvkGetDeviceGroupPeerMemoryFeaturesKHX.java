package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPeerMemoryFeaturesKHX extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHX() {
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHX(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHX(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHX(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeaturesKHX(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPeerMemoryFeaturesKHX"));
    }

    public void call(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlagsKHX pPeerMemoryFeatures){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddress(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.getNullAddress(), localDeviceIndex != null ? localDeviceIndex.getVkAddress() : VkPointer.getNullAddress(), remoteDeviceIndex != null ? remoteDeviceIndex.getVkAddress() : VkPointer.getNullAddress(), pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long heapIndex, long localDeviceIndex, long remoteDeviceIndex, long pPeerMemoryFeatures);
}
