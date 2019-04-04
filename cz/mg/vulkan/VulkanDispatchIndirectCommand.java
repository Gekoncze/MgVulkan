package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDispatchIndirectCommand.html">khronos documentation</a>
 **/
public class VulkanDispatchIndirectCommand extends VulkanObject {
    public VulkanDispatchIndirectCommand(){
        super(new VkDispatchIndirectCommand());
    }

    public VulkanDispatchIndirectCommand(VkDispatchIndirectCommand vk){
        super(vk);
    }

    @Override
    public VkDispatchIndirectCommand getVk(){
        return (VkDispatchIndirectCommand) super.getVk();
    }

    public VulkanDispatchIndirectCommand(VulkanUInt32 x, VulkanUInt32 y, VulkanUInt32 z) {
        super(new VkDispatchIndirectCommand(x.getVk(), y.getVk(), z.getVk()));
    }

    public VulkanUInt32 getX() {
        return new VulkanUInt32(getVk().getX());
    }

    public void setX(VulkanUInt32 x) {
        getVk().setX(x.getVk());
    }

    public VulkanUInt32 getY() {
        return new VulkanUInt32(getVk().getY());
    }

    public void setY(VulkanUInt32 y) {
        getVk().setY(y.getVk());
    }

    public VulkanUInt32 getZ() {
        return new VulkanUInt32(getVk().getZ());
    }

    public void setZ(VulkanUInt32 z) {
        getVk().setZ(z.getVk());
    }


    public static class Array extends VulkanDispatchIndirectCommand implements cz.mg.collections.array.ReadonlyArray<VulkanDispatchIndirectCommand> {
        public Array(VkDispatchIndirectCommand.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDispatchIndirectCommand.Array(count));
        }

        public Array(int count, VulkanDispatchIndirectCommand o){
            this(new VkDispatchIndirectCommand.Array(count, o.getVk()));
        }

        @Override
        public VkDispatchIndirectCommand.Array getVk(){
            return (VkDispatchIndirectCommand.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDispatchIndirectCommand get(int i){
            return new VulkanDispatchIndirectCommand(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDispatchIndirectCommand.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDispatchIndirectCommand.Pointer());
        }

        public Pointer(long value) {
            this(new VkDispatchIndirectCommand.Pointer(value));
        }

        @Override
        public VkDispatchIndirectCommand.Pointer getVk(){
            return (VkDispatchIndirectCommand.Pointer) super.getVk();
        }

        public static class Array extends VulkanDispatchIndirectCommand.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDispatchIndirectCommand.Pointer> {
            public Array(int count) {
                super(new VkDispatchIndirectCommand.Pointer.Array(count));
            }

            public Array(VulkanDispatchIndirectCommand[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDispatchIndirectCommand.Pointer.Array getVk(){
                return (VkDispatchIndirectCommand.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDispatchIndirectCommand.Pointer get(int i){
                return new VulkanDispatchIndirectCommand.Pointer(getVk().get(i));
            }
        }
    }
}
