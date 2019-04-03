package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/PFN_vkInternalFreeNotification.html">khronos documentation</a>
 **/
public class PFNInternalFreeNotification extends VulkanFunctionPointer {
    public PFNInternalFreeNotification(){
        super(new PFNvkInternalFreeNotification());
    }

    public PFNInternalFreeNotification(PFNvkInternalFreeNotification vk){
        super(vk);
    }

    @Override
    public PFNvkInternalFreeNotification getVk(){
        return (PFNvkInternalFreeNotification) super.getVk();
    }

    public PFNInternalFreeNotification(long value){
        super(value);
    }
}
