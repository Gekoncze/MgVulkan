package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindImageMemory2KHR.html">khronos documentation</a>
 **/
public class PFNvkBindImageMemory2KHR extends VkFunctionPointer {
    public PFNvkBindImageMemory2KHR() {
    }

    public PFNvkBindImageMemory2KHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindImageMemory2KHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindImageMemory2KHR(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory2KHR(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory2KHR"));
    }

    public void call(VkDevice device, VkUInt32 bindInfoCount, VkBindImageMemoryInfo pBindInfos, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, bindInfoCount != null ? bindInfoCount.getVkAddress() : VkPointer.NULL_ADDRESS, pBindInfos != null ? pBindInfos.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long bindInfoCount, long pBindInfos, long rval);
}
