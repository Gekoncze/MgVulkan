package cz.mg.vulkan;

public class PFNvkGetDeviceGroupPeerMemoryFeatures extends VkFunctionPointer {
    public PFNvkGetDeviceGroupPeerMemoryFeatures() {
    }

    public PFNvkGetDeviceGroupPeerMemoryFeatures(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeatures(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public PFNvkGetDeviceGroupPeerMemoryFeatures(long value) {
        setValue(value);
    }

    public PFNvkGetDeviceGroupPeerMemoryFeatures(VkInstance instance) {
        super(instance, new VkString("vkGetDeviceGroupPeerMemoryFeatures"));
    }

    public void call(VkDevice device, VkUInt32 heapIndex, VkUInt32 localDeviceIndex, VkUInt32 remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.getSinkAddress(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.getSinkAddress(), localDeviceIndex != null ? localDeviceIndex.getVkAddress() : VkPointer.getSinkAddress(), remoteDeviceIndex != null ? remoteDeviceIndex.getVkAddress() : VkPointer.getSinkAddress(), pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long heapIndex, long localDeviceIndex, long remoteDeviceIndex, long pPeerMemoryFeatures);
}
