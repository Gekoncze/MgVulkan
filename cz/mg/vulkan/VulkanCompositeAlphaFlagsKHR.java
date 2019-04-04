package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompositeAlphaFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanCompositeAlphaFlagsKHR extends VulkanFlags {
    public VulkanCompositeAlphaFlagsKHR(){
        super(new VkCompositeAlphaFlagsKHR());
    }

    public VulkanCompositeAlphaFlagsKHR(VkCompositeAlphaFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkCompositeAlphaFlagsKHR getVk(){
        return (VkCompositeAlphaFlagsKHR) super.getVk();
    }

    public VulkanCompositeAlphaFlagsKHR(int value){
        super(new VkCompositeAlphaFlagsKHR(value));
    }

    public static class Array extends VulkanCompositeAlphaFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanCompositeAlphaFlagsKHR> {
        public Array(VkCompositeAlphaFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkCompositeAlphaFlagsKHR.Array(count));
        }

        public Array(int count, VulkanCompositeAlphaFlagsKHR o){
            this(new VkCompositeAlphaFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkCompositeAlphaFlagsKHR.Array getVk(){
            return (VkCompositeAlphaFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanCompositeAlphaFlagsKHR get(int i){
            return new VulkanCompositeAlphaFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkCompositeAlphaFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkCompositeAlphaFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkCompositeAlphaFlagsKHR.Pointer(value));
        }

        @Override
        public VkCompositeAlphaFlagsKHR.Pointer getVk(){
            return (VkCompositeAlphaFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanCompositeAlphaFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanCompositeAlphaFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkCompositeAlphaFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanCompositeAlphaFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkCompositeAlphaFlagsKHR.Pointer.Array getVk(){
                return (VkCompositeAlphaFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanCompositeAlphaFlagsKHR.Pointer get(int i){
                return new VulkanCompositeAlphaFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
