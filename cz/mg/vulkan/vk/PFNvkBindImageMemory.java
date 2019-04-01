package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindImageMemory.html">khronos documentation</a>
 **/
public class PFNvkBindImageMemory extends VkFunctionPointer {
    public PFNvkBindImageMemory() {
    }

    public PFNvkBindImageMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindImageMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindImageMemory(long value) {
        setValue(value);
    }

    public PFNvkBindImageMemory(VkInstance instance) {
        super(instance, new VkString("vkBindImageMemory"));
    }

    public void call(VkDevice device, VkImage image, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, image != null ? image.getVkAddress() : VkPointer.NULL_ADDRESS, memory != null ? memory.getVkAddress() : VkPointer.NULL_ADDRESS, memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.NULL_ADDRESS, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long image, long memory, long memoryOffset, long rval);
}
