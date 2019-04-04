package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFramebuffer.html">khronos documentation</a>
 **/
public class VulkanFramebuffer extends VulkanHandle {
    public VulkanFramebuffer(){
        super(new VkFramebuffer());
    }

    public VulkanFramebuffer(VkFramebuffer vk){
        super(vk);
    }

    @Override
    public VkFramebuffer getVk(){
        return (VkFramebuffer) super.getVk();
    }

    public VulkanFramebuffer(int value){
        super(new VkFramebuffer(value));
    }

    public static class Array extends VulkanFramebuffer implements cz.mg.collections.array.ReadonlyArray<VulkanFramebuffer> {
        public Array(VkFramebuffer.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFramebuffer.Array(count));
        }

        public Array(int count, VulkanFramebuffer o){
            this(new VkFramebuffer.Array(count, o.getVk()));
        }

        @Override
        public VkFramebuffer.Array getVk(){
            return (VkFramebuffer.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFramebuffer get(int i){
            return new VulkanFramebuffer(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFramebuffer.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFramebuffer.Pointer());
        }

        public Pointer(long value) {
            this(new VkFramebuffer.Pointer(value));
        }

        @Override
        public VkFramebuffer.Pointer getVk(){
            return (VkFramebuffer.Pointer) super.getVk();
        }

        public static class Array extends VulkanFramebuffer.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFramebuffer.Pointer> {
            public Array(int count) {
                super(new VkFramebuffer.Pointer.Array(count));
            }

            public Array(VulkanFramebuffer[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFramebuffer.Pointer.Array getVk(){
                return (VkFramebuffer.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFramebuffer.Pointer get(int i){
                return new VulkanFramebuffer.Pointer(getVk().get(i));
            }
        }
    }
}
