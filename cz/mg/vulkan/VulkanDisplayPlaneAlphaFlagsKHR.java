package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDisplayPlaneAlphaFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanDisplayPlaneAlphaFlagsKHR extends VulkanFlags {
    public VulkanDisplayPlaneAlphaFlagsKHR(){
        super(new VkDisplayPlaneAlphaFlagsKHR());
    }

    public VulkanDisplayPlaneAlphaFlagsKHR(VkDisplayPlaneAlphaFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkDisplayPlaneAlphaFlagsKHR getVk(){
        return (VkDisplayPlaneAlphaFlagsKHR) super.getVk();
    }

    public VulkanDisplayPlaneAlphaFlagsKHR(int value){
        super(new VkDisplayPlaneAlphaFlagsKHR(value));
    }

    public static class Array extends VulkanDisplayPlaneAlphaFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlaneAlphaFlagsKHR> {
        public Array(VkDisplayPlaneAlphaFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDisplayPlaneAlphaFlagsKHR.Array(count));
        }

        public Array(int count, VulkanDisplayPlaneAlphaFlagsKHR o){
            this(new VkDisplayPlaneAlphaFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkDisplayPlaneAlphaFlagsKHR.Array getVk(){
            return (VkDisplayPlaneAlphaFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDisplayPlaneAlphaFlagsKHR get(int i){
            return new VulkanDisplayPlaneAlphaFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDisplayPlaneAlphaFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDisplayPlaneAlphaFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkDisplayPlaneAlphaFlagsKHR.Pointer(value));
        }

        @Override
        public VkDisplayPlaneAlphaFlagsKHR.Pointer getVk(){
            return (VkDisplayPlaneAlphaFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanDisplayPlaneAlphaFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDisplayPlaneAlphaFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkDisplayPlaneAlphaFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanDisplayPlaneAlphaFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDisplayPlaneAlphaFlagsKHR.Pointer.Array getVk(){
                return (VkDisplayPlaneAlphaFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDisplayPlaneAlphaFlagsKHR.Pointer get(int i){
                return new VulkanDisplayPlaneAlphaFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
