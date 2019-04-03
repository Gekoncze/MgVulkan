package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkAllocationFunction.html">khronos documentation</a>
 **/
public class PFNAllocationFunction extends VulkanFunctionPointer {
    public PFNAllocationFunction(){
        super(new PFNvkAllocationFunction());
    }

    public PFNAllocationFunction(PFNvkAllocationFunction vk){
        super(vk);
    }

    @Override
    public PFNvkAllocationFunction getVk(){
        return (PFNvkAllocationFunction) super.getVk();
    }

    public PFNAllocationFunction(long value){
        super(value);
    }
}
