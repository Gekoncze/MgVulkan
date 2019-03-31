package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkGetDeviceGroupPeerMemoryFeatures.html">khronos documentation</a>
 **/
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
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), heapIndex != null ? heapIndex.getVkAddress() : VkPointer.NULL, localDeviceIndex != null ? localDeviceIndex.getVkAddress() : VkPointer.NULL, remoteDeviceIndex != null ? remoteDeviceIndex.getVkAddress() : VkPointer.NULL, pPeerMemoryFeatures != null ? pPeerMemoryFeatures.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long heapIndex, long localDeviceIndex, long remoteDeviceIndex, long pPeerMemoryFeatures);
}
