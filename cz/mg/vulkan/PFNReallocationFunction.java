package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkReallocationFunction.html">khronos documentation</a>
 **/
public class PFNReallocationFunction extends VulkanFunctionPointer {
    public PFNReallocationFunction(){
        super(new PFNvkReallocationFunction());
    }

    public PFNReallocationFunction(PFNvkReallocationFunction vk){
        super(vk);
    }

    @Override
    public PFNvkReallocationFunction getVk(){
        return (PFNvkReallocationFunction) super.getVk();
    }

    public PFNReallocationFunction(long value){
        super(value);
    }
}
