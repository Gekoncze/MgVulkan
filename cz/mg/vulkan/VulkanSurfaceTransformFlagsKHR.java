package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceTransformFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanSurfaceTransformFlagsKHR extends VulkanFlags {
    public VulkanSurfaceTransformFlagsKHR(){
        super(new VkSurfaceTransformFlagsKHR());
    }

    public VulkanSurfaceTransformFlagsKHR(VkSurfaceTransformFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkSurfaceTransformFlagsKHR getVk(){
        return (VkSurfaceTransformFlagsKHR) super.getVk();
    }

    public VulkanSurfaceTransformFlagsKHR(int value){
        super(new VkSurfaceTransformFlagsKHR(value));
    }

    public static class Array extends VulkanSurfaceTransformFlagsKHR implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceTransformFlagsKHR> {
        public Array(VkSurfaceTransformFlagsKHR.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSurfaceTransformFlagsKHR.Array(count));
        }

        public Array(int count, VulkanSurfaceTransformFlagsKHR o){
            this(new VkSurfaceTransformFlagsKHR.Array(count, o.getVk()));
        }

        @Override
        public VkSurfaceTransformFlagsKHR.Array getVk(){
            return (VkSurfaceTransformFlagsKHR.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSurfaceTransformFlagsKHR get(int i){
            return new VulkanSurfaceTransformFlagsKHR(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSurfaceTransformFlagsKHR.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSurfaceTransformFlagsKHR.Pointer());
        }

        public Pointer(long value) {
            this(new VkSurfaceTransformFlagsKHR.Pointer(value));
        }

        @Override
        public VkSurfaceTransformFlagsKHR.Pointer getVk(){
            return (VkSurfaceTransformFlagsKHR.Pointer) super.getVk();
        }

        public static class Array extends VulkanSurfaceTransformFlagsKHR.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSurfaceTransformFlagsKHR.Pointer> {
            public Array(int count) {
                super(new VkSurfaceTransformFlagsKHR.Pointer.Array(count));
            }

            public Array(VulkanSurfaceTransformFlagsKHR[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSurfaceTransformFlagsKHR.Pointer.Array getVk(){
                return (VkSurfaceTransformFlagsKHR.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSurfaceTransformFlagsKHR.Pointer get(int i){
                return new VulkanSurfaceTransformFlagsKHR.Pointer(getVk().get(i));
            }
        }
    }
}
