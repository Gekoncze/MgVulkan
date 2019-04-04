package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPass.html">khronos documentation</a>
 **/
public class VulkanRenderPass extends VulkanHandle {
    public VulkanRenderPass(){
        super(new VkRenderPass());
    }

    public VulkanRenderPass(VkRenderPass vk){
        super(vk);
    }

    @Override
    public VkRenderPass getVk(){
        return (VkRenderPass) super.getVk();
    }

    public VulkanRenderPass(int value){
        super(new VkRenderPass(value));
    }

    public static class Array extends VulkanRenderPass implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPass> {
        public Array(VkRenderPass.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkRenderPass.Array(count));
        }

        public Array(int count, VulkanRenderPass o){
            this(new VkRenderPass.Array(count, o.getVk()));
        }

        @Override
        public VkRenderPass.Array getVk(){
            return (VkRenderPass.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanRenderPass get(int i){
            return new VulkanRenderPass(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkRenderPass.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkRenderPass.Pointer());
        }

        public Pointer(long value) {
            this(new VkRenderPass.Pointer(value));
        }

        @Override
        public VkRenderPass.Pointer getVk(){
            return (VkRenderPass.Pointer) super.getVk();
        }

        public static class Array extends VulkanRenderPass.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanRenderPass.Pointer> {
            public Array(int count) {
                super(new VkRenderPass.Pointer.Array(count));
            }

            public Array(VulkanRenderPass[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkRenderPass.Pointer.Array getVk(){
                return (VkRenderPass.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanRenderPass.Pointer get(int i){
                return new VulkanRenderPass.Pointer(getVk().get(i));
            }
        }
    }
}
