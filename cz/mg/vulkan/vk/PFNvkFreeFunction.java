package cz.mg.vulkan.vk;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkFreeFunction.html">khronos documentation</a>
 **/
public class PFNvkFreeFunction extends VkFunctionPointer {
    public PFNvkFreeFunction() {
    }

    public PFNvkFreeFunction(VkMemory vkmemory) {
        super(vkmemory);
    }

    public PFNvkFreeFunction(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public PFNvkFreeFunction(long value) {
        setValue(value);
    }

    public void call(VkObject pUserData, VkObject pMemory){
        call(getValue(), pUserData != null ? pUserData.getVkAddress() : VkPointer.NULL, pMemory != null ? pMemory.getVkAddress() : VkPointer.NULL);
    }

    private static native void call(long vkaddress, long pUserData, long pMemory);
}
