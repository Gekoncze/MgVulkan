package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkBindBufferMemory.html">khronos documentation</a>
 **/
public class PFNvkBindBufferMemory extends VkFunctionPointer {
    public PFNvkBindBufferMemory() {
    }

    public PFNvkBindBufferMemory(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkBindBufferMemory(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkBindBufferMemory(long value) {
        setValue(value);
    }

    public PFNvkBindBufferMemory(VkInstance instance) {
        super(instance, new VkString("vkBindBufferMemory"));
    }

    public void call(VkDevice device, VkBuffer buffer, VkDeviceMemory memory, VkDeviceSize memoryOffset, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkDevice.NULL.getVkAddress(), buffer != null ? buffer.getVkAddress() : VkBuffer.NULL.getVkAddress(), memory != null ? memory.getVkAddress() : VkDeviceMemory.NULL.getVkAddress(), memoryOffset != null ? memoryOffset.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long device, long buffer, long memory, long memoryOffset, long rval);
}
