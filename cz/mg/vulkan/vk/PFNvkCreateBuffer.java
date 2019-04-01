package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkCreateBuffer.html">khronos documentation</a>
 **/
public class PFNvkCreateBuffer extends VkFunctionPointer {
    public PFNvkCreateBuffer() {
    }

    public PFNvkCreateBuffer(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkCreateBuffer(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkCreateBuffer(long value) {
        setValue(value);
    }

    public PFNvkCreateBuffer(VkInstance instance) {
        super(instance, new VkString("vkCreateBuffer"));
    }

    public void call(VkDevice device, VkBufferCreateInfo pCreateInfo, VkAllocationCallbacks pAllocator, VkBuffer pBuffer, VkResult rval){
        call(getValue(), device != null ? device.getVkAddress() : VkPointer.NULL_ADDRESS, pCreateInfo != null ? pCreateInfo.getVkAddress() : VkPointer.NULL, pAllocator != null ? pAllocator.getVkAddress() : VkPointer.NULL, pBuffer != null ? pBuffer.getVkAddress() : VkPointer.NULL, rval != null ? rval.getVkAddress() : VkPointer.NULL_ADDRESS);
    }

    private static native void call(long vkaddress, long device, long pCreateInfo, long pAllocator, long pBuffer, long rval);
}
