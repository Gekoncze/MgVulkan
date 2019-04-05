package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

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
