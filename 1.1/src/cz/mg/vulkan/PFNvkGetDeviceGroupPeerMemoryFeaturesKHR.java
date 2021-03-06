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

    public void call(VkDevice device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, VkPeerMemoryFeatureFlags pPeerMemoryFeatures){
        callNative(getValue(), device != null ? device.getVkAddress() : VkPointer.getNullAddressNative(), heapIndex, localDeviceIndex, remoteDeviceIndex, pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    protected static native void callNative(long vkaddress, long device, int heapIndex, int localDeviceIndex, int remoteDeviceIndex, long pPeerMemoryFeatures);

}
