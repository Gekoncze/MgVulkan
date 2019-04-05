package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanIndirectCommandsLayoutNVX extends VulkanHandle {
    VulkanIndirectCommandsLayoutNVX(){
        super(new VkIndirectCommandsLayoutNVX());
    }

    VulkanIndirectCommandsLayoutNVX(VkIndirectCommandsLayoutNVX vk){
        super(vk);
    }

    @Override
    public VkIndirectCommandsLayoutNVX getVk(){
        return (VkIndirectCommandsLayoutNVX) super.getVk();
    }




    public static class Array extends VulkanIndirectCommandsLayoutNVX implements cz.mg.collections.array.ReadonlyArray<VulkanIndirectCommandsLayoutNVX> {
        Array(VkIndirectCommandsLayoutNVX.Array a) {
            super(a);
        }

        Array(int count) {
            this(new VkIndirectCommandsLayoutNVX.Array(count));
        }

        Array(int count, VulkanIndirectCommandsLayoutNVX o){
            this(new VkIndirectCommandsLayoutNVX.Array(count, o.getVk()));
        }

        @Override
        public VkIndirectCommandsLayoutNVX.Array getVk(){
            return (VkIndirectCommandsLayoutNVX.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanIndirectCommandsLayoutNVX get(int i){
            return new VulkanIndirectCommandsLayoutNVX(getVk().get(i));
        }
    }

}
